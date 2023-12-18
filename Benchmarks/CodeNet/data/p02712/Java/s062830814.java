import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	      int N = in.nextInt();
	      System.out.println(N);
	      long sum = 0;
	       for(int i = 0; i <= N; ++i){
	           if (!(i % 3 == 0) && !(i % 5 == 0)){
	           sum = sum + i;
	           }
	       }
	      System.out.println(sum);
	    }
}