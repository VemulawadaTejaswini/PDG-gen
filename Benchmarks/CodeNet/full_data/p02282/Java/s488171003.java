import java.util.*;
import java.io.*;

class Main {
	
	static int[] preorder;
	static int[] inorder;
	static int[] postorder;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		
		preorder = new int[n];
		inorder = new int[n];
		postorder = new int[n];
		
		for (int i = 0; i < n; i++) {
			preorder[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			inorder[i] = sc.nextInt();
		}
		
		reconstruct(0,0,0,n);
		System.out.print(postorder[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" "+postorder[i]);
		}
		System.out.println();
	}
	
	static void reconstruct(int pre, int in, int post, int n){
		if(n<=0) return;
		final int q = preorder[pre];
		postorder[post+n-1] = q;
		int x;
		for(x = in; inorder[x]!=q; x++);
		final int l = n-(x-in)-1;
		reconstruct(pre+1, in, post, x-in);
		reconstruct(pre+1+x-in, x+1, post+x-in, l);
	}

}
