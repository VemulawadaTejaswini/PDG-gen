import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        long N = stdin.nextLong();
        int sqr = (int)Math.sqrt(N);
        double s = (double) Math.sqrt(N);
        int ans=0;
        if(N % 2 != 0) {
        	if(s!=(int)s) 
        		System.out.println(N-1);
        	else
        		System.out.println(s+s-2);
        }
        else {
        	for(int i=sqr;i<N;i++) {
        		for(int j=sqr;j>0;j--) {
        			if(N%i != 0) {
        				break;
        			}
        			if(i*j == N) {
        				ans =i+j-2;
        				break;
        			}
        		}
        		if(ans != 0) {
        			break;
        		}
        	}
        	System.out.println(ans);
        }
	}
}
