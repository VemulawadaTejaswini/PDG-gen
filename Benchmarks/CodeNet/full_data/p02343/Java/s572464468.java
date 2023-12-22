import java.util.ArrayList;
import java.util.Scanner;
public class DSL_1_A {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
	int q = scan.nextInt();
	Union_Find_Tree u = new Union_Find_Tree(n);
	u.make();
	for(int i = 0; i < q; i++) {
	    int com = scan.nextInt();
	    int tree1 = scan.nextInt();
	    int tree2 = scan.nextInt();
	    u.union_judge(com,tree1,tree2);
	}
	for (int i : u.result) System.out.println(i);
    }
}
class Union_Find_Tree {
    int n,flag;
    ArrayList<Integer>tree = new ArrayList<Integer>();
    ArrayList<Integer>union = new ArrayList<Integer>();
    ArrayList<Integer>result = new ArrayList<Integer>();
    public Union_Find_Tree(int n){this.n = n;}

    void union_judge(int com, int tree1, int tree2) {
        if (com == 0) {
	    for(int i = 0; i < n; i++)
		if(union.get(tree2) == union.get(i))
		    union.set(i, union.get(tree1));
	}
	else
	    same(tree1,tree2);
    }
    
    void make() {
	for(int i = 0; i < n; i++) {
	    tree.add(i);
	    union.add(i);
	}
    }
    void same(int tree1, int tree2) {
	if(union.get(tree1) == union.get(tree2)) result.add(1);
	else result.add(0);
    }
}

