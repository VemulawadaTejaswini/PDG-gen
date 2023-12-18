import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int X[][]=new int[N][D];
		int Distsq=0;
		double Residue;
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				X[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<(N-1);k++) {
			for(int l=(k+1);l<N;l++) {
				for(int m=0;m<D;m++) {
					Distsq+=(int)Math.pow((X[k][m]-X[l][m]),2);
				}
				Residue=Math.sqrt(Distsq)-Math.round(Math.sqrt(Distsq));
				if(Residue==0) {
					count++;
				}
				Distsq=0;
			}
		}
		System.out.println(count);
	}
}