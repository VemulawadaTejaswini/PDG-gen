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
		
		int sol=(pos1+(K-2))/(K-1);
		sol+= ((N-pos1-1)+(K-2))/(K-1);
		System.out.println(sol);
	}
}


