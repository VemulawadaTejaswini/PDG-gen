import java.util.*;

class Elt {

	private int id;
	private Elt parent,left,right;

	//Constructor
	public Elt(int id){this.id = id;}

	//getter,setter
	public int getId() {return id;}

	public Elt getParent() {return parent;}
	public void setParent(Elt parent) {this.parent = parent;}
	
	public Elt getLeft() {return left;}
	public void setLeft(Elt left) {this.left = left;}
	
	public Elt getRight() {return right;}
	public void setRight(Elt rigth) {this.right = rigth;}
}

class Tree{
	public ArrayList<Elt> t;
	public static final int LEFT  = 1,
	                        RIGHT = 2;
	public Tree(){
		this.t = new ArrayList<Elt>();		
	}
	public void add(Elt e){
		if(t.size() == 0){t.add(e);return;}
		Elt node   = t.get(Main.ROOT),
		    parent = null;
		int sibling = Main.EMPTY;
		while(node != null){
			parent = node;
			if(e.getId() < node.getId()){
				node   = node.getLeft();
				sibling = LEFT;
			} else {
				node   = node.getRight();
				sibling = RIGHT;
			}
		}
		if(sibling == LEFT ){parent.setLeft(e);}
		if(sibling == RIGHT){parent.setRight(e);}
		t.add(e);
		return;
	}
}

public class Main {

	public static final String INSERT    = "insert",
	                           PRINT     = "print";
	public static final int    EMPTY     = -1,
	                           ROOT      = 0,
	                           PRE = 1,IN = 2,POST = 3;

	private static Tree tree = new Tree();

    public static void main(String[] args) {
    	input();
    }

	private static void input() {
    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	int N = sc.nextInt();

    	String[] s = null;
        for(int i = 0; i < N; i++){
        	s = sc.next().split("\\s");
        	if(s[0].equals(INSERT)){tree.add(new Elt(Integer.parseInt(s[1])));}
        	if(s[0].equals(PRINT)){print_walk_tree();}
        }
	}

	private static void print_walk_tree(){
		Elt root = tree.t.get(ROOT);
     	print_order(root,IN);
    	System.out.println();
     	print_order(root,PRE);
    	System.out.println();
	}

	private static void print_order(Elt e,int order_type){
		Elt left  = e.getLeft(),
	        right = e.getRight();
		if(order_type == PRE){System.out.print(" " + e.getId());}
		if(left != null){print_order(left,order_type);}
		if(order_type == IN){System.out.print(" " + e.getId());}
		if(right != null){print_order(right,order_type);}
		if(order_type == POST){System.out.print(" " + e.getId());}
	}
}