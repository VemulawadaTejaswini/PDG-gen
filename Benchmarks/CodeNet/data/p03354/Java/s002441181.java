import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] p = new int[n];
		int[] union = new int[n];
		for(int i=0;i<n;i++) {
			p[i] = in.nextInt()-1;
			union[i] = i;
		}
		for(int i=0;i<m;i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			unite(union,x,y);
		}
		long res = 0;
		for(int i=0;i<n;i++) {
			if(root(union,p[i])==root(union,i)) res++;
		}
		System.out.println(res);
		in.close();
	}
	
	private static void unite(int[] union,int x,int y) {
		union[root(union,y)] = root(union,x);
	}
	
	private static int root(int[] union,int x) {
		while(union[x]!=x) {
			x = union[x];
		}
		return x;
	}

}
