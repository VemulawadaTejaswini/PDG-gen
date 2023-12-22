import java.util.*;

class OUT_el implements Comparable<OUT_el>{

	public int id;
	public int parent;
	public int[] child;
	public String type;
	public int depth;

	public String toString(){
		String s;
		s = "node " + id + ": parent = " + parent + ", depth = " + depth + ", " + type + ", [";
		for(int i = 0,cl;i < (cl = child.length);i++){
			s += Integer.toString(child[i]);
			if(i < cl-1){
				s += ", ";
			}
		}
		s += "]";
		return s;
	}
	
	public int compareTo (OUT_el e){
		return this.id - e.id;
	}
}

class IN_el {
	public int id;
	public int k;
	public int c[];
}

public class Main {

	public static final int ROOT = -1;
	public static final String ROOT_TYPE = "root";
	public static final String NODE_TYPE = "internal node";
	public static final String LEAF_TYPE = "leaf";

	private static ArrayList<IN_el>  in  = new ArrayList<IN_el>();
	private static ArrayList<OUT_el> out = new ArrayList<OUT_el>();

    public static void main(String[] args) {

    	input();

    	//edit
    	set_1_5();
    	set_2();
    	set_3();
    	set_4();
    	
    	//sort by id.
    	Collections.sort(out);
    	
    	output();
    }

	private static void input() {
    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	int N = sc.nextInt();

    	String[] s = null;
    	IN_el ie = null;
        for(int i = 0; i < N; i++){
        	s = sc.next().split("\\s");
        	ie = new IN_el();
        	ie.id = Integer.parseInt(s[0]);
        	ie.k  = Integer.parseInt(s[1]);
        	
        	ie.c = new int[s.length-2];
        	for(int j = 2; j < s.length; j++){
        		ie.c[j-2] = Integer.parseInt(s[j]);
        	}
        	in.add(ie);
        }
	}

	private static void set_1_5(){
		for(int i=0; i<in.size();i++){
			IN_el ie = in.get(i);                    //  input????卒?????????????
			OUT_el oe = new OUT_el();                // output????卒?????????????
			oe.id = ie.id;                           // id?????????
			oe.child = new int[ie.c.length];         // child?????????
			for (int j = 0; j < ie.c.length; j++) {
				oe.child[j] = ie.c[j];
			}
			out.add(oe);                             // output????????????
		}
	}
	
	private static void set_2(){
		for(int i = 0; i < out.size(); i++){
			calc_parent(i);
		}
	}
	
	private static void calc_parent(int i){
		OUT_el e = out.get(i);
		int id = e.id;
		boolean find_flag = false;
		for(OUT_el oe:out){
			if(id == oe.id){continue;}
			for(int c:oe.child){
				if(id == c){
					e.parent = oe.id;
					find_flag = true;
				}
			}
		}
		if(!find_flag){e.parent = ROOT;}
	}

	private static void set_3(){
		for(int i=0;i<out.size();i++){
			out.get(i).depth=calc_depth(i);
		}
	}
	private static int calc_depth(int i){
		int depth = 0;
		OUT_el e = out.get(i);
		for(int id=e.id;;depth++){
			id=searchParent(id);
			if(id==-2){System.err.println("parent search error");}
			if(id==ROOT){break;}
		}
		return depth;
	}

	private static int searchParent(int id){
		for(OUT_el e:out){
			if(id==e.id){return e.parent;}
		}
		return -2;
	}
	
	private static void set_4(){
		for(OUT_el e:out){
			if(e.parent==ROOT){e.type=ROOT_TYPE;}
			if(e.parent!=ROOT && e.child.length!=0){e.type=NODE_TYPE;}
			if(e.parent!=ROOT && e.child.length==0){e.type=LEAF_TYPE;}
		}
	}

	private static void output(){
		for(OUT_el e:out){
			System.out.println(e);
		}
	}
}