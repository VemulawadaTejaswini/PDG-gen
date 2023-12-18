import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long one = 0;
		long two = 0;
		double beta = A % B;
		long buf2 = A / B;
		long ansbuf = 0;
		long ans = 0;
		for(long i = 1;i < N + 1;i++){
			double alpha = i % B;
			long buf1 = i / B;
			if(i < B){
				two = 0;
				if(A < B){
					double tmp = (double)A / (double)B;
					one = (long)Math.floor(tmp * i);
				}else if(A == B){
					two = i;
				}else if(A > B){
					if(beta * i > B){
						double tmp = (double)i / (double)B;
						one = buf2 * i + (long)Math.floor(beta * tmp);
					}else if(beta * i == B){
						one = buf2 * i + 1;
					}else{
						one = buf2 * i;
					}
				}
			}else if(i == B){
				two = 1;
				one = A;
			}else if(i > B){
				two = buf1;
				if(A < B){
					one = buf1 * A;
				}else if(A == B){
					one = i;
				}else if(A > B){
					double tmp = buf2 * alpha;
					double tmp2 = beta * alpha / B;
					one = (long)Math.floor(tmp + tmp2);
				}
			}
			ansbuf = one - A * two;
			ans = Math.max(ansbuf,ans);
		}
		System.out.println(ans);
	}
}