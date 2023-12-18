import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextInt();
	    long M = sc.nextInt();
	    long count = N;
	    for(int i = 0; i < M; i++) {
	        count -= sc.nextLong();
        }
	    if(count < 0) {
            System.out.println(-1);
        }else {
            System.out.println(count);
        }
	}
}