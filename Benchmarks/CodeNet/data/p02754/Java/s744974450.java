import java.util.*;

public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	long N = (long) itr.nextInt();
      	long A = (long) itr.nextInt();
      	long B = (long) itr.nextInt();
      
      	long time = N / (A + B);
      	long res = N - time * (A + B);
      	if (res > A)
          res = A;
      	res += (time * A);
      
      	System.out.println(res);
      	
    }
}
