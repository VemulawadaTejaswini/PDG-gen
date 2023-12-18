import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] h = new long[n];
		for(int i = 0; i<n; i++){
			h[i] = sc.nextLong();
		}
		long tmax=1000000000;
		long tmin=0;
		while(tmax-tmin>1){
			int k = 0;
			long t =(tmax+tmin)/2;
			for(int i = 0; i<n; i++){
				if(h[i]>b*t){
					k+=Math.ceil((double)(h[i]-b*t)/(double)(a-b));
				}
			}
			if(k>t){
				tmin=t;
			}else{
				tmax=t;
			}
		}
		System.out.println(tmax);
	}
}
