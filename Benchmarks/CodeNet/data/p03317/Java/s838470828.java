import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] a=new int[N];
		
		int pos1=-1;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			if(a[i]==1)pos1=i;
		}
		
		int n1=pos1;
		int n2=N-1-n1;
		int sol=n1/(K-1)+n2/(K-1);
		if(n1%(K-1)!=0)sol++;
		if(n2%(K-1)!=0)sol++;
		System.out.println(sol);
	}
}


