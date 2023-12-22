import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=cin.nextInt();
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-1;j++)System.out.print(A[j]+" ");
			System.out.println(A[n-1]);
			
			int v=A[i];
			int j=i-1;
			while(j>=0 && A[j]>v) {
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=v;
		}
		for(int j=0;j<n-1;j++)System.out.print(A[j]+" ");
		System.out.println(A[n-1]);

	}

}
