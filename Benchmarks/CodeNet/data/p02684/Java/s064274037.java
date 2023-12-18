import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	long K=sc.nextLong();
	int A[]=new int[N];
	int T[]=new int[N];
	for(int i=0;i<N;i++) {
		A[i]=sc.nextInt();
		T[i]=0;
	}
	int a=0;
	int b=0;
	int k=0;
	int c=0;
	int x=0;
	ArrayList<Integer> L=new ArrayList<Integer>();
	for(int i=0;i<K+1;i++) {
		a=A[a]-1;
		if(T[i]!=2) {
			T[a]=1;
		}
		else {	
		}
		if(T[a]==2&&i>b) {
			 k=i-b;
			 x=0;
			break;
		}
		
		
		if(T[a]==1) {
			 b=i;
			T[a]=2;
			c=a;
			x=1;
		}
		else {}
		if(T[c]==2) {
			L.add(a);
		}
		else {}
	}
	if(b==0||x==1) {
		System.out.println(a+1);
	}
	else {
		for(int i=0;i<k;i++) {
		if((K-b-1)%k==i) {
			System.out.println((L.get(i)+1));
		}
	}
	}
	}
}
