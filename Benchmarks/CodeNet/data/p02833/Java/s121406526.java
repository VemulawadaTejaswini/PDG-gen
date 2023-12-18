import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        if(n%2==0) {
	    	for(long i=0;i<=n;i+=2) {
	    		if(i%5==0)res++;
	    	}
        }
        System.out.println(res);
        sc.close();
    }
}
