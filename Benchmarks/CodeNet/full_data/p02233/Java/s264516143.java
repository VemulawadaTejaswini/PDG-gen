import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Long> fib = new ArrayList<Long>();

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         long N = sc.nextLong();

         long init = 1;

         for(int i = 0; i < N+1; i++){
        	 if(i==0){fib.add(init);continue;}
        	 if(i==1){fib.add(init);continue;}
        	 fib.add(fib.get(i-2) + fib.get(i-1));
         }

         System.out.println(fib.get(fib.size()-1));
	}
}