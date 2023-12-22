
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),m=cin.nextInt();
		int A[][]=new int[100][100];
		int B[]=new int[100];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int x=cin.nextInt();
				A[i][j]=x;
			}
		}
		
		for(int i=0;i<m;i++) {
			int x=cin.nextInt();
			B[i]=x;
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				sum+=A[i][j]*B[j];
			}
			System.out.println(sum);
		}
	}
}
