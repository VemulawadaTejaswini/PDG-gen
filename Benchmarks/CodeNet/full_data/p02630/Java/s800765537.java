import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] x=new int[100000000];
		for(int i=0;i<n;i++){
			int r=sc.nextInt();
			x[r]++;
			sum+=r;
		}
		
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			x[b]+=x[a];
			sum+=(b-a)*x[a];
			x[a]=0;
			System.out.println(sum);
		}

	}
}