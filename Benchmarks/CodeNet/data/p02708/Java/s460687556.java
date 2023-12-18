import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	     
	    long min = 0;
	    long max = 0;
	    for(int i = 0; i < K; i++) {
	        min += i;
	        max += N - i;
	    }
	    long sum = max - min + 1;
	    
	    for(int i = K; i <= N; i++) {
	        min += i;
	        max += N - i;
	        sum += max - min + 1;
	    }
	    System.out.println(sum);
	    
	    
	}
	

}