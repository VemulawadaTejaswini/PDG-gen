import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    long N = Integer.parseInt(sc.next());
    long N2 = Integer.parseInt(sc.next());
    long N3 = Integer.parseInt(sc.next());
    long N4 = Integer.parseInt(sc.next());
    if(N4-N <= 0) {
    	System.out.println(N*1);
    } else if((N4-N) - N2 <= 0) {
    	System.out.println(N*1);
    } else {
    	System.out.println(N*1 + (-1 * ((N4-N) - N2)));
    }

  }
}