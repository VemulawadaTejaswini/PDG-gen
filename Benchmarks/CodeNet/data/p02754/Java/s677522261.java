import java.util.*;

public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int n = itr.nextInt();
      	int a = itr.nextInt();
      	int b = itr.nextInt();
      	
      	long N = (long) n;
      	long A = (long) a;
      	long B = (long) b;
      	
      	long time = N / (A + B) * A;
      	long res = N % (A + B);
      	res = Math.min(res, A);
      	res += time;
      
      	System.out.println(res);
      	
    }
}
