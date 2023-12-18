import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] p=new int[44];
		int max=0;
		long sum=0;
		long c=1;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			sum+=a;
			int count=0;
			while(a>0){
				if((a & 1)==1){
					p[count]++;
				}
				a>>=1;
				count++;
			}
			if(max<count){
				max=count;
			}
		}
		for(int i = 0; i<max; i++){
			if((n-p[i])*2>n){
				sum+=c*((n-p[i])-p[i]);
			}
			c*=2;
		}
		long count1 = 1;
		while(k>0){
				if((k & 1)==1 && count>=max){
					sum+=n*Math.pow(2,count);
				}
				k>>=1;
				count1++;
			}
		System.out.println(sum);
	}
}