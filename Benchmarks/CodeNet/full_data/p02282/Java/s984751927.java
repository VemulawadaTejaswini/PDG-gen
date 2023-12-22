import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] preorder = new int[n];
	int[] inorder = new int[n];
	String[] inputPre, inputIn;
	inputPre = scan.nextLine().split(" ");
	inputIn = scan.nextLine().split(" ");
	for (int i = 0; i < n; i++) {
	    preorder[i] = Integer.parseInt(inputPre[i]);
	    inorder[i] = Integer.parseInt(inputIn[i]);
	}
	Reconstructer recnst = new Reconstructer(preorder, inorder);
	recnst.runReconstruct();
	recnst.printPostorder();
    }
}
class Reconstructer {
    int[] preorder;
    int[] inorder;
    int[] postorder;
    int prePosition, postPosition;
    Reconstructer (int[] preorder, int[] inorder) {
	this.preorder = preorder;
	this.inorder = inorder;
	postorder = new int[preorder.length];
    }
    void runReconstruct () {
	reconstruct(0, preorder.length);
    }
    void reconstruct (int left, int right) {
	if (left >= right) {
	    return;
	}	
	int inPosition = 0;
	int node = preorder[prePosition++];
	while (node != inorder[inPosition]) {
	    inPosition++;
	}
	reconstruct(left, inPosition);
	reconstruct(inPosition+1, right);
	postorder[postPosition++] = node;
    }
    void printPostorder () {
	StringBuilder sb = new StringBuilder();
	int n = postorder.length;
	for (int i = 0; i < n - 1; i++) {
	    sb.append(postorder[i] + " ");
	}
	sb.append(postorder[n-1] + "\n");
	System.out.print(sb);
    }
}