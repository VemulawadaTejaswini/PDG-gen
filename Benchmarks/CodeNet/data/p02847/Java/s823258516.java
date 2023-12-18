import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long X = sc.nextLong();
    long right = 1000000001;
    long N = 50000000;
    int Nle = String.valueOf(N).length();
 
    while (X == 0) {
	    if (A * N + B * Nle == X) {
    	  System.out.print(X);
    	} else if (A * N + B * Nle > X) {
    	  N = N / 2;
    	} else if (A * N + B * Nle < X) {
    	  N += N / 2;
    	}
    }
  }
}