import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        long N = stdin.nextLong();
        double sqr = (double)Math.sqrt(N);
        long ans = 0;
       
        for(int i=1;i<=sqr;i++) {
        	if(N%i == 0) {
        		ans = i+N/i;
        	}
        }
        System.out.println(ans-2);
	}
}
