import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tree t = new Tree(n);

        for(int i = 0; i < n; i++) {
        	int id = sc.nextInt();
        	int k = sc.nextInt();
        	int pc = -1;
        	for(int j = 0; j < k; j++) {
        		int c = sc.nextInt();
        		if(j == 0)
        			t.node[id].left = c;
        		else
        			t.node[pc].right = c;
        		t.node[c].parent = id;
        		pc = c;
        	}
        }

        for(int i = 0; i < n; i++)
        	t.print(i);

        sc.close();
        System.exit(0);
	}
}
class Tree {
	class Node {
		int parent = -1;
		int left = -1;
		int right = -1;

		public int getDepth() {
			if(parent == -1)
				return 0;
			else
				return node[parent].getDepth() + 1;
		}

		public String getType() {
			if (parent == -1)
                return "root";
            else if (left == -1)
                return "leaf";
            else
                return "internal node";
		}
	}
	Node[] node;

	public Tree(int n) {
		node = new Node[n];
		for(int i = 0; i < n; i++)
			node[i] = new Node();
	}

	public void print(int i) {
		System.out.print("node " + i + ": parent = " + node[i].parent
				+ ", depth = " + node[i].getDepth() + ", " + node[i].getType() + ", [" );
		if(node[i].left != -1) {
			System.out.print(node[i].left);
            for (int c = node[node[i].left].right; c != -1; c = node[c].right)
                System.out.print(", " + c);
		}
		System.out.println("]");
	}
}

