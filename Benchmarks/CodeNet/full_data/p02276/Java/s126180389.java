import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),A[]=new int[n];

		for(int i=0;i<n;i++)A[i]=Integer.parseInt(in.next());

		int stdIndex=partition(A,n,A[n-1]);

		for(int i=0;i<n-1;i++) {
			if(i==stdIndex) {
				System.out.print("["+A[i]+"] ");
			}
			else System.out.print(A[i]+" ");
		}
		if(n-1==stdIndex) {
			System.out.println("["+A[n-1]+"]");
		}
		else System.out.println(A[n-1]);
	}

	static int partition(int A[],int n,int std) {
		int i=0;
		do {
			while(i<n && A[i]<=std)i++;
			if(i==n)return i-1;

			int j=i;
			while(j<n && A[j]>std)j++;

			int tmp=A[i];
			A[i]=A[j];
			A[j]=tmp;

			if(j==n-1)return i;
		}while(true);
	}

}

