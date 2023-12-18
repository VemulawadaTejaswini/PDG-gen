import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//偶数を正とする
		long counter=0;
		
		long sum=0;
		
		for(int i=0;i<n;i++) {
			
			sum+=a[i];
			
			if(i%2==0 && sum<=0) {
				
				//-aだったら+1の操作をa回で0になり
				//正にするならそこからさらに+1
				
				counter+=Math.abs(sum)+1;
				sum=1;
				
			}else if(i%2==1 && sum>=0){
				
				//+aだったらa回の-1と1回の-1でマイナス
				counter+=sum+1;
				sum=-1;
				
			}
			
			
		}
		
		long counter1=0;
		long sum1=0;
		
		
		
		//奇数を正
		for(int i=0;i<n;i++) {
			
			sum1+=a[i];
			
			if(i%2==0 && sum1>=0) {
				
				//+aだったらa回の-1と1回の-1でマイナス
				counter1+=sum1+1;
				sum1=-1;
				
			}else if(i%2==1 && sum1<=0){
				//-aだったら+1の操作をa回で0になり
				//正にするならそこからさらに+1
				
				counter1+=Math.abs(sum1)+1;
				sum1=1;
				
				
				
			}
			
			
		}
		
		
		System.out.println(Math.min(counter,counter1));


	}
	
	
}
