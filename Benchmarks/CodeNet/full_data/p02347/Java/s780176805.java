import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Node{
    int location;
    int p, l, r;
    Node() {}
    Node(int NIL) {
	this.p = NIL; 
	this.l = NIL;
	this.r = NIL;
    }
}

class Point{
    int id, x, y;
    Point() {}
    Point(int id, int x, int y) {
	this.id = id;     // i????????????
	this.x = x;
	this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
}

public class Main {
    public static final int NIL = -1;
    public static final int MAX = 500001;
    static int N;
    static int np;
    static int ans[] = new int[MAX]; 
    static int ans_pointer;
    static Point[] P = new Point[MAX];
    static Node[] T = new Node[MAX];

    static int makeKDTree(int l, int r, int depth) {
	if ( !(l < r) ) return NIL;
	int mid = (l + r) / 2;     // ????????????????????????????????????
	int t = np++;              // ????????¨??????????????????????¨????
	if (depth % 2 == 0) {
	    Arrays.sort(P, l, r, new Comparator<Point>() {
		    public int compare(Point p1, Point p2) {
			return p1.getX() - p2.getX();
		    }
		});
	} else {
	    Arrays.sort(P, l, r, new Comparator<Point>() {
		    public int compare(Point p1, Point p2) {   //  
			return p1.getY() - p2.getY();
		    }
		});
	}
	T[t].location = mid;
	T[t].l = makeKDTree(l, mid, depth+1);        // 
	T[t].r = makeKDTree(mid+1, r, depth+1);
	return t;
    }

    static void find(int v, int sx, int tx, int sy, int ty, int depth) {
	int x = P[T[v].location].x;
	int y = P[T[v].location].y;
	if (sx <= x && x <= tx && sy <= y && y <= ty) {
	    ans[ans_pointer] = P[T[v].location].id;
	    ans_pointer++;
	}
	if (depth % 2 == 0) {
	    if (T[v].l != NIL && sx <= x) find(T[v].l, sx, tx, sy, ty, depth+1);
	    if (T[v].r != NIL && x <= tx) find(T[v].r, sx, tx, sy, ty, depth+1);
	} else {
	    if (T[v].l != NIL && sy <= y) find(T[v].l, sx, tx, sy, ty, depth+1);
	    if (T[v].r != NIL && y <= ty) find(T[v].r, sx, tx, sy, ty, depth+1);
	}
    }

    public static void main(String args[]) {
	int x, y;
	Scanner scan = new Scanner(System.in);
	N = scan.nextInt();
	for (int i = 0; i < N; i++) {
	    x = scan.nextInt();
	    y = scan.nextInt();
	    P[i] = new Point(i, x, y);
	    T[i] = new Node(NIL);
	}
	np = 0;
	int root = makeKDTree(0, N, 0);
	int q = scan.nextInt();
	int sx, tx, sy, ty;
	for (int i = 0; i < q; i++) {
	    sx = scan.nextInt();
	    tx = scan.nextInt();
	    sy = scan.nextInt();
	    ty = scan.nextInt();
	    ans_pointer = 0;
	    find(root, sx, tx, sy, ty, 0);
	    Arrays.sort(ans, 0, ans_pointer);
	    for (int j = 0; j < ans_pointer; j++) {
		System.out.println(ans[j]);
	    }
	    System.out.println();
	}
    }
}