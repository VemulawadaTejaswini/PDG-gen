import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in); 
		int n = as.nextInt();
		int m = as.nextInt();
		long[] x,y;
		x = new long[n];
		for(int i=0;i<n;i++){
			x[i] = Long.parseLong(as.next());
		}
		y = new long[m];
		for(int i=0;i<m;i++){
			y[i] = Long.parseLong(as.next());
		}
		long l = 0;
		int a,b;
		a=1;
		b=2;
		for(int ii=0;ii<(n-1)*(m-1);ii++){
			for(int i=0;i<n-1;i++){
				for(int s=0;s<m-1;s++){
					try{
						l+=(x[i+a]-x[i])*(y[s+b]-y[s]);
						l=l%1000000007;
					}catch(Exception e){
						break;
					}
				}
			}
			b++;
			if(b==m){
				b=1;
				a++;
			}
		}
		System.out.println((l+(x[n-1]-x[0])*(y[m-1]-y[0]))%1000000007);
	}
}