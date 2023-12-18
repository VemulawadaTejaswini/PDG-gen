import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long x,y,z = 0;
        x = N / (A + B);
        y = N % (A + B);
        z = (A * x) + y;
        if(A == 0) {
        	System.out.println("0");
        }else{
        	System.out.println(z);
        }
	}
}