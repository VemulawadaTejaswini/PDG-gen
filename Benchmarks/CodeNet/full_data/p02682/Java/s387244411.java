import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int N2 = Integer.parseInt(sc.next());
    int N3 = Integer.parseInt(sc.next());
    int N4 = Integer.parseInt(sc.next());
    if(N4-N <= 0) {
    	System.out.println(N4*1);
    } else if((N4-N) - N2 <= 0) {
    	System.out.println(N*1);
    } else {
    	System.out.println(N*1 + (-1 * ((N4-N) - N2)));
    }

  }
}