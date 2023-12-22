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
	public static final int NON   = 0,
	                        LEFT  = 1,
	                        RIGHT = 2,
	                        BOTH  = 3;
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
		e.setParent(parent);
		if(sibling == LEFT ){parent.setLeft(e);}
		if(sibling == RIGHT){parent.setRight(e);}
		t.add(e);
		return;
	}

	public boolean find(int id){
		Elt target = getElt(id);
		if   (target != null){return true;}
		else                 {return false;}
	}

	public Elt getElt(int id){
		if(t.size() == 0){return null;}
		Elt node = t.get(Main.ROOT);
		while(node != null){
			if(node.getId() == id){return node;}
			if(id < node.getId()){node = node.getLeft();}
			else                 {node = node.getRight();}
		}
		return null;
	}

	public void delete (int id){
		Elt e     = getElt(id);
//		System.out.print("delete?????? ");
//		Main.print_walk_tree();
		if(e == null){return;}
		Elt left  = e.getLeft(),
		    right = e.getRight();
		if(left == null){ if  (right == null){del(e,NON);}
			              else               {del(e,RIGHT);}}
		if(left != null){ if  (right == null){del(e,LEFT);}
		                  else               {del(e,BOTH);}}
	}

	private void del(Elt target,int sibling){
		Elt parent = target.getParent(),
		    left   = target.getLeft(),
		    right  = target.getRight(),
		    substitution  = null;
		if      (sibling == NON)  {}
		else if (sibling == LEFT) {substitution = left;}
		else if (sibling == RIGHT){substitution = right;}
		else if (sibling == BOTH) {substitution = getMinR(target);}

		if(sibling != NON){substitution.setParent(parent);}
		if(parent != null){
			if   (parent.getId() < target.getId()){parent.setRight(substitution);}
			else                                  {parent.setLeft(substitution);}
		}
		if(sibling == BOTH){
			substitution.setLeft (left );
			left.setParent (substitution);
			if(substitution.getId() != right.getId()){
				substitution.setRight(right);
				right.setParent(substitution);
			} else {
				substitution.setRight(null);
			}
		}
		for (int i = 0;i < t.size();i++) {
			if(target.getId() == t.get(i).getId()){t.remove(i);}
		}
	}

	private Elt getMinR(Elt target){
		Elt e            = target.getRight(),
		    substitution = null;
		while(e != null){
			substitution = e;
			e            = e.getLeft();
		}
		Elt r = substitution.getRight();
		if(r == null){setParentNull (substitution);}
		else         {setParentChild(substitution, r);}
		return substitution;
	}

	private void setParentNull(Elt e){
		Elt parent = e.getParent();
		if   (parent.getId() < e.getId()){parent.setRight(null);}
		else                             {parent.setLeft (null);}
	}
	
	private void setParentChild(Elt self,Elt child){
		Elt parent = self.getParent();
		if   (parent.getId() < self.getId()){parent.setRight(child);}
		else                                {parent.setLeft (child);}
		child.setParent(parent);
	}
}

public class Main {

	public static final String INSERT    = "insert",
	                           FIND      = "find",
	                           PRINT     = "print",
	                           DELETE    = "delete";

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
        	if(s[0].equals(FIND))  {find(Integer.parseInt(s[1]));}
        	if(s[0].equals(DELETE)){tree.delete(Integer.parseInt(s[1]));}
        	if(s[0].equals(PRINT)) {print_walk_tree();}
        }
	}

	private static void find(int id){
		boolean ret = tree.find(id);
		if(ret){System.out.println("yes");}
		else   {System.out.println("no");}
	}

	public static void print_walk_tree(){
		Elt root = get_root();
//		if(root == null){System.out.println("root is null !");return;}else{System.out.println("not null. root.getId():" + root.getId());}
     	print_order(root,IN);
    	System.out.println();
     	print_order(root,PRE);
    	System.out.println();
	}

	private static Elt get_root(){
		Elt ret = null;
		for(Elt e:tree.t){if(e.getParent() == null){ret = e;}}
		return ret;
	}
	
	private static void print_order(Elt e,int order_type){
		Elt left  = e.getLeft(),
	        right = e.getRight();
		if(order_type == PRE){System.out.print(" " + e.getId());}
//		if(order_type == PRE){print_node(e);}
		if(left != null){print_order(left,order_type);}
		if(order_type == IN){System.out.print(" " + e.getId());}
//		if(order_type == IN){print_node(e);}
		if(right != null){print_order(right,order_type);}
		if(order_type == POST){System.out.print(" " + e.getId());}
	}

	public static void print_tree(){
		for(Elt e:tree.t){
			print_node(e);
		}
	}
	
	public static void print_node(Elt e){
		System.out.print(" ID: " + e.getId());
		if(e.getParent() != null){
			System.out.print(", parent: " + e.getParent().getId());
		}else {
			System.out.print(", parent: null");
		}
		if(e.getLeft() != null){
			System.out.print(", left: " + e.getLeft().getId());
		}else {
			System.out.print(", left: null");
		}
		if(e.getRight() != null){
			System.out.println(", right: " + e.getRight().getId());
		}else {
			System.out.println(", right: null");
		}
	}
}