import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.io.IOException;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void debug(String s) {
	//System.out.println(s);
    }


    public static int[] readIntegers(BufferedReader input) 
	throws IOException
    {
	String line = input.readLine();
	String[] parts = line.trim().split("\\s+");
	int[] res = new int[parts.length];
	for (int i = 0; i < res.length; i++)
	    res[i] = Integer.parseInt(parts[i]);
	return res;
    }



    static class Point {
	int x, y;
	Point(int px, int py) {x = px; y = py;}

	@Override
	public int hashCode() {
	    return 31*x  + y;
	}

	@Override
	public boolean equals(Object other) {
	    if (other instanceof Point) {
		Point o = (Point) other; 
		//debug("debug point equals " + this.toString() + " " + o.toString() +
		//		   (this.x == o.x && this.y == o.y));
		return (this.x == o.x && this.y == o.y);
	    } else return false;
	}

	public String toString() {
	    return "" + x + "," + y;
	}
    }


    static class Line {
	int y;
	int[] x;
	int d; // d == 0:  xxy line;      d == 1: yyx line
	Line ref; // for union find
	int size; // for balanced union find
	HashSet<Line> crosses; //for speedy lookup
	Line(int[] xxy, int dir) {
	    this.x = new int[] {Math.min(xxy[0], xxy[1]), Math.max(xxy[0], xxy[1])};
	    this.y = xxy[2];
	    this.ref = null;
	    this.d = dir;
	    this.crosses = new HashSet<Line>();
	}
	public String toString () {
	    return ("line dir " + this.d + " (" + this.x[0] + "," + this.x[1] + ") " + this.y);
	}
    }


    static class Field {
	HashMap<Integer, ArrayList<Line>> lines;
	int max;
	HashMap<Line,HashSet<Line>> roots = new HashMap<Line, HashSet<Line>>();
	Field(ArrayList<Line> xlines, ArrayList<Line> ylines) {
	    this.lines = new HashMap<Integer, ArrayList<Line>>();
	    this.lines.put(0, xlines);
	    this.lines.put(1, ylines);
	    this.max = Integer.MAX_VALUE - 1;
	}

	public void pruneClusters() {
	    ArrayList<Line> dclusters = new ArrayList<>();
	    for (Line root: roots.keySet()) {
		if (roots.get(root).size() < 4) {
		    dclusters.add(root);
		}
	    }
	    for (Line root: dclusters) {
		for (Line line: roots.get(root)) {
		    int d = line.d;
		    lines.get(d).remove(line);
		}
		roots.remove(root);
	    }
	}

	public void init() {
	    for (int dir: lines.keySet())
		for (Line line: lines.get(dir)) {line.ref = line; line.size = 1;}
	    for (Line xline: lines.get(0)) {
		for(Line yline: lines.get(1)) {
		    Point inter = intersect(xline, yline);
		    if (inter != null) {
			join(xline, yline);
			xline.crosses.add(yline);
			yline.crosses.add(xline);
		    }
		}
	    }
	    makeClusters();
	    pruneClusters();
	}

	public Line root(Line line) {
	    while (line.ref != line) {
		Line temp = line;
		line = line.ref;
		temp.ref = line.ref;
	    }
	    return line;
	}

	public void show() {
	    for (int dir: lines.keySet()) 
		for (Line line: lines.get(dir)) {
		    debug(line.toString() + " -> " + root(line).toString() + " crossing: ");
		    for (Line cr: line.crosses) {
			debug(cr.toString());
		    }
		}

	    debug(" " + this.roots.size() + " clusters ");
	    for (Line root: this.roots.keySet()) {
		debug("root " +  root.toString());
		for (Line line: this.roots.get(root))
		    debug(line.toString());
	    }

	}
	
	public void join(Line xline, Line yline) {
	    Line xroot = root(xline);
	    Line yroot = root(yline);
	    if (xroot.size < yroot.size) {
		xroot.ref = yroot;
		yroot.size += xroot.size;
	    } else {
		yroot.ref = xroot;
		xroot.size += yroot.size;
	    }
	}

	public void makeClusters() {
	    HashMap<Line,HashSet<Line>> roots = new HashMap<Line, HashSet<Line>>();
	    for (int dir: lines.keySet())
		for (Line line: lines.get(dir)) {
		    if (!roots.containsKey(root(line))) {
			HashSet<Line> single = new HashSet<Line>(Arrays.asList(line));
			roots.put(root(line), single);
		    } else {
			roots.get(root(line)).add(line);
		    }
		}
	    this.roots =  roots;
	}

    }




    public static boolean sep(Line line1, Line line2) {
	assert line1.d == line2.d : "sep not implemented for orthogonal lines" ;
	return (line1.y != line2.y) ||
	    (Math.max(line1.x[0], line2.x[0]) > 
	     Math.min(line1.x[1], line2.x[1]));
    }

    public static Line union(Line line1, Line line2) {
	assert line1.d == line2.d : "union not implemented for orthogonal lines";
	assert line1.y == line2.y : "union not implemented with diff normal position";
	//debug("union call on " + line1 + "\n" +  line2);
	int[] xxy = new int[] {  Math.min(line1.x[0],line2.x[0]),
				 Math.max(line1.x[1],line2.x[1]),
				 line1.y};
	Line line = new Line(xxy, line1.d);
	//debug("union result " + line);
	return line;
    }


    public static Field readInput()  
    // kills zero lines
    // merges overlapping lines
    // saves lines coordinates in the ordered form
	throws IOException
  {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int[] size  = readIntegers(input);
	Field field = new Field(null, null);
	
	for (int dir = 0; dir < 2; dir ++) {
	    Line[] lines = new Line[size[dir]];
	    int j = 0;
	    for (int i = 0; i < size[dir]; i ++) {
		int[] xzy = readIntegers(input);
		Line xline;
		if (dir == 0) xline = new Line(xzy, dir);
		else xline = new Line(new int[] {xzy[1], xzy[2], xzy[0]}, dir);
		if (xline.x[0] != xline.x[1]) {
		    int k;
		    for (k = 0; k < j && sep(lines[k],xline); k++);
		    if (k == j)
			{lines[j] = xline; j++;}
		    else
			{lines[k] = union(lines[k],xline);}
		}
	    }
	    ArrayList<Line> lines_ = new ArrayList<>();
	    for (int i = 0; i < j; i++) lines_.add(lines[i]);
	    Collections.sort(lines_, (a,b) -> a.y - b.y);
	    field.lines.put(dir, lines_);
	}
	return field;
    }
    


    public static Point intersect(Line xline, Line yline) {
	// return absolute point
	assert xline.d == 1 - yline.d : "not implemented for parallel lines";
	if (yline.x[0] <= xline.y && xline.y <= yline.x[1]
	    && xline.x[0] <= yline.y && yline.y <= xline.x[1]) {
	    int px = yline.y;
	    int py = xline.y;
	    Point p;
	    if (xline.d == 0) p = new Point(px, py);
	    else p = new Point(py, px);
	    return p;
	} else {
	    return null;
	}
    }

    public static Line ray(Field f, Point p, Point v) {
	int speed = v.x == 0 ? v.y : v.x;
	int dir_move = v.x == 0 ? 1 : 0 ;
	int[] xzy;
	if (v.x == 0) xzy = new int[] {p.y, f.max * speed, p.x};
	else xzy = new int[] {p.x, f.max * speed, p.y};
	return new Line(xzy, dir_move);
    }

    public static Line next_intersection(Field f, Point p, Point v) {
	// return orthogonal line with which we'll intersect
	int dir_lines = v.x == 0 ? 0 : 1;
	int dir_move = 1 - dir_lines;
	int speed = v.x == 0 ? v.y : v.x;
	int py = v.x == 0 ? p.y : p.x;

	Line yline = ray(f, p, v);
	ArrayList<Line> xlines = f.lines.get(dir_lines);
	int i0 = (speed == 1 ? 0 : (xlines.size() - 1));
	int i1 = (speed == 1 ? xlines.size() : -1); 
	int i;
	//debug("movement in " + yline.toString() + " speed "
	//		   + speed + " i0 " + i0 + " i1 " + i1); 
	for (i = i0;  i*speed < i1*speed && xlines.get(i).y*speed <= py*speed; i += speed);
	if (i == i1) return null;
	for (; i*speed < i1*speed && (null == intersect(xlines.get(i), yline)) ; i += speed);
	if (i == i1) return null;
	//debug("found line " + xlines[i].toString());
	return xlines.get(i);
    }


    public static boolean belongs(Line line, Point p) {
	if (line.d == 0)
	    return (line.y == p.y && line.x[0] <= p.x && p.x <= line.x[1]);
	else
	    return (line.y == p.x && line.x[0] <= p.y && p.y <= line.x[1]);
    }

    public static Point turn_left(Point v) {
	Point u = new Point( -v.y, v.x);
	return u;
    }

    public static Point turn_right(Point v) {
	Point u = new Point( v.y, -v.x);
	return u;
    }

    static class State {
	Point p;
	Point v;
	Line cur;
	Line perp;
	public State(Point p, Point v, Line cur, Line perp) {
	    this.p = p; this.v = v; this.cur = cur; this.perp = perp;
	}
	public String toString() {
	    return ("in point " +  p.x + "," +  p.y + " v " +
		     v.x + "," +  v.y + "\n" +
		     cur + " "  +  cur.toString() + "  perp " +
		     perp.toString());
	}
	@Override
	public int hashCode() {
	    return 31 * p.hashCode() + v.hashCode();
	}

	@Override
	public boolean equals(Object other) {
	    if (other instanceof State) {
		State o = (State) other;
		return (this.p.equals(o.p) && this.v.equals(o.v));}
	    else return false;
	}
    }

    public static State next_state(Field f, State s) {
	// finds next intersection tracing with right-hand on wall
	// returns the same state if we are at single cross
	assert (s.cur.d == 1 - s.perp.d) : "cur and perp lines are not perpendicular in next_v";
	assert (s.v.x == 0 && s.cur.d == 1) || (s.v.y == 0 && s.cur.d == 0): "v disagree with cur.d";

	Line[] cross = new Line[] {s.perp, s.cur};
	Point u = turn_left(s.v);
	Point p_next = null;

	for (int turns = 0; turns < 4; turns++) {
	Line cand = next_intersection(f, s.p, u);
	if (cand != null) {
	    p_next = intersect(cross[turns%2], cand);
	    if (p_next != null) {
		State new_state = new State(p_next, u, cross[turns%2], cand);
		return new_state;
	    }
	}
	u = turn_right(u);
	}
	return s;
    }

    public static ArrayList<State> loop_boundary(Field f, State s) {
	State origin = s;
	ArrayList<State> res = new ArrayList<>();
	int cutoff = 20;
	while (cutoff > 0)  {
	    //debug(s.toString());
	    res.add(s);
	    State next_st = next_state(f, s);
	    if (origin.equals(next_st)) break;
	    else s = next_st;
	    cutoff -= 1;
	}
	return res;
    }


    


    public static int dist(Point p1, Point p2) {
	assert ( (p1.x == p2.x) || (p1.y == p2.y) ) : "implemented only for points at the vert/horiz";
	return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public static  State nextObstacle(Field field, Point origin, Point v) {
	// starting from origin and direction v
	// finds the first wall in direction v that has intersections
	// goes to the first  intersection traversing the wall 

	Line next_line = next_intersection(field, origin, v);
	if (next_line == null || next_line.crosses.size() == 0) {
	    return null;
	} else {
	    Line r = ray(field, origin, v);
	    Point p = intersect(r, next_line);
	    Point near_p = null;
	    int min_dist = field.max;
	    Line next2_line = null;
	    for (Line other_line: next_line.crosses) {
		Point other_p = intersect(next_line, other_line);
		if (near_p == null || dist(p, other_p) < min_dist) {
		    min_dist = dist(p, other_p);
		    near_p = other_p;
		    next2_line = other_line;
		}
	    }
	    Point u = turn_left(v);
	    Line temp_ray = ray(field, p, u);
	    State s;
	    if (belongs(temp_ray, near_p)) 
		s = next_state(field, new State(near_p, u, next_line, next2_line));
	    else
	        s = next_state(field, new State(near_p, v, next2_line, next_line));
	    return s;
	}
    }

    public static long area(ArrayList<State> bnd) {
	//  positive \int x dy  tracing inside the boundary with boundary on the right
	State p  = bnd.get(bnd.size() - 1);
	long area = 0;
	long inc; 
	for(State s: bnd) {
	    inc =  s.p.x * (s.p.y - p.p.y);
	    area += inc;
	    //debug(s.toString());
	    p = s;
	}
	return area;
    }

    public static Point highest_point (ArrayList<State> bnd) {
	//highest leftest point
	if (bnd == null) return null;
	else {
	    Point p = bnd.get(0).p;
	    for (State s: bnd) if (s.p.y > p.y || s.p.y == p.y && s.p.x < p.x) p = s.p;
	    return p;
	}
    }

    public static Point highest_point(HashSet<Line> cluster) {
	Line high_line = null;
	for (Line line: cluster) {
	    if (line.d == 0) {
		if (high_line == null || line.y > high_line.y) high_line = line;
	    }
	}
	return new Point(high_line.x[0], high_line.y);
    }



    public static ArrayList<State> internal_bnd(Field field, Point origin) {
	// cow tries to escape to the north, tracing fences on its way;
	// if tracing area is negative, jump to the right to next fence
	// if next fence does not exist return null
	// area is positive, return the this limiting  boundary
	Point v = new Point(0,1);
	
	while (true) {
	    State st = nextObstacle(field, origin, v);
	    if (st == null) return null;

	    ArrayList<State> bnd = loop_boundary(field, st);
	    long a = area(bnd);
	    if (a > 0) return bnd;
	    //debug("obstacle of area " + a + ", jumping higher");
	    origin = highest_point(bnd);
	}
    }
	



    public static void main(String[] args)
	throws IOException
    {
	Field field = readInput();
	field.init();
	field.show();
	Point origin = new Point(0,0);
	ArrayList<State> bnd = internal_bnd(field, origin);
	if (bnd == null) {
	    System.out.println("INF");
	    return;
	} else  {
	    Point cow_hp = highest_point(bnd);
	    long  cow_area = area(bnd);
	    long  result = cow_area; 
	    //debug("Cow Ext Bnd of size " + bnd.size() + " of area " + cow_area + " hp " + cow_hp);
	    for (Line root: field.roots.keySet()) {
		Point cluster_origin  = highest_point(field.roots.get(root));
		//debug("cluster origin " + cluster_origin);
		ArrayList<State> cl_esc_bnd = internal_bnd(field, cluster_origin);
		if (cl_esc_bnd !=null) {
		    long cl_esc_area = area(cl_esc_bnd);
		    Point cl_esc_hp = highest_point(cl_esc_bnd);
		    //debug("Cluster Esc Bnd of size " +
		    //	       cl_esc_bnd.size() + " of area " + cl_esc_area + " hp " + cl_esc_hp);
		    if (cl_esc_area == cow_area && cow_hp.equals(cl_esc_hp)) {
			//debug("matching escape boundary.. reducing cow area.. tracing cluster");
			Point shifted_origin = new Point(cluster_origin.x - 1, cluster_origin.y);
			State cluster_begin = nextObstacle(field, shifted_origin, new Point(1,0));
			long cl_area = area(loop_boundary(field, cluster_begin));
			//debug("correction to result: " + cl_area);
			result += cl_area;
		    }
		}  else {
		//debug("escape from cluster");
		}
	    }
	    System.out.println("" + result);
	}
    }
}
