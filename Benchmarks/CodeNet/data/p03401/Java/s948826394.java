import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++) {
			if(i==a-1) {
				sum=sum+Math.abs(b[i]-0);
				break;
			}
			if(i==0) sum=sum+Math.abs(0-b[i]);
			sum=sum+Math.abs(b[i]-b[i+1]);
		}
		int Asum=sum;
		for(int i=0;i<a;i++) {
			sum=Asum;
			if(i==0) {
				sum=sum-Math.abs(0-b[i]);
				sum=sum-Math.abs(b[i]-b[i+1]);
				sum=sum+Math.abs(0-b[i+1]);
				System.out.println(sum);
				continue;
			}
			if(i==a-1) {
				sum=sum-Math.abs(b[i]-0);
				sum=sum-Math.abs(b[i-1]-b[i]);
				sum=sum+Math.abs(b[i-1]-0);
				System.out.println(sum);
				break;
			}
			sum=sum-Math.abs(b[i]-b[i+1])-Math.abs(b[i-1]-b[i]);
			sum=sum+Math.abs(b[i-1]-b[i+1]);
			System.out.println(sum);
		}
		
	}
}