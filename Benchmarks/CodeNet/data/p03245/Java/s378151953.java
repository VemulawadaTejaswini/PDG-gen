import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long x[] = new long[n], y[] = new long[n];
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		
		long parity = Math.abs((x[0] + y[0]) % 2);
		
		boolean f = true;
		for(int i=1;i<n;i++){
			if(Math.abs((x[i]+y[i])%2) != parity)
				f = false;
		}
		
		if(f){
			long a[];
			
			if(parity==0){
				a = new long[32];
				a[0] = 1;
				a[1] = 1;
				for(int i=2;i<32;i++){
					a[i] = a[i-1] * 2;
				}
			}
			else{
				a = new long[31];
				a[0]=1;
				for(int i=1;i<31;i++){
					a[i] = a[i-1] * 2;
				}
			}
			
			System.out.println(a.length);
			
			for(int i=a.length-1;i>=0;i--){
				System.out.print(i==0 ? a[i]:a[i]+" ");
			}
			
			System.out.println();
			
			for(int i=0;i<n;i++){
				long total = (1L << 30) -1;
				if(parity==0)
					total += 1;
				
				for(int j=a.length-1;j>=0;j--){
					if(Math.abs(x[i]-a[j]) + Math.abs(y[i]) <= total){
						x[i] -= a[j];
						System.out.print("R");
					}
					else if(Math.abs(x[i]+a[j]) + Math.abs(y[i]) <= total){
						x[i] += a[j];
						System.out.print("L");
					}
					else if(Math.abs(x[i]) + Math.abs(y[i]-a[j]) <= total){
						y[i] -= a[j];
						System.out.print("U");
					}
					else{
						y[i] += a[j];
						System.out.print("D");
					}
					total>>=1;
				}
				
				System.out.println();
			}
			
		}
		else{
			System.out.println(-1);
		}
	}

}
