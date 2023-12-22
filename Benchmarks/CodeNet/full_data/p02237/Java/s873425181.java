import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),M[][]=new int[n][n];
		
		
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
			for(int j=0;j<k;j++) {
				M[u-1][Integer.parseInt(in.next())-1]=1;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-1)System.out.println(M[i][j]);
				else System.out.print(M[i][j]+" ");
			}
		}
	}

}

