import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int Q = sc.nextInt();
    		TreeNode[] tree = new TreeNode[N];
    		for (int i=0; i<N; i++) {
    			tree[i] = new TreeNode();
    		}

    		for (int i=0; i<N-1; i++) {
    			final int ai = sc.nextInt();
    			final int bi = sc.nextInt();
    			tree[ai-1].children.add(tree[bi-1]);
    		}

    		for (int i=0; i<Q; i++) {
    			final int pi = sc.nextInt();
    			final int xi = sc.nextInt();

    			Queue<TreeNode> queue = new ArrayDeque<>();
    			queue.add(tree[pi-1]);
    			while (!queue.isEmpty()) {
    				TreeNode currentNode = queue.remove();
    				currentNode.value += xi;
    				currentNode.children.stream().forEach(node -> { queue.add(node); });
    			}
    		}

    		for (int i=0; i<N; i++) {
    			System.out.print(tree[i].value);
    			System.out.print(" ");
    		}
    		System.out.println();

    	} finally {
    		sc.close();
    	}
    }


}

class TreeNode {
	public int value = 0;
	public ArrayList<TreeNode> children = new ArrayList<>();
}
