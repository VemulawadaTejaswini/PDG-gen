import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long f[]=new long[10000005];
		for(int i=1;i<10000005;i++) {
			for(int j=i;j<10000005;j+=i) {
				if(j%i==0) {
					f[j]++;
				}
			}
		}
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i*f[i];
		}
		System.out.println(sum);
	}
	
	

}