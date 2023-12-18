import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		long sum=0;
		long[] h=new long[n];
		
		for(int i=0;i<n;i++){
			h[i]=sc.nextLong();
		}
		
		if(k>=n)System.out.println(0);
		else{
			long ti=0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if(h[i]>h[j]){
						ti=h[j];
						h[j]=h[i];
						h[i]=ti;
					}
				}
			}
			
			for(int i=0;i<n-k;i++){
				sum+=h[i];
			}
			System.out.println(sum);
		}
		
	}
}
