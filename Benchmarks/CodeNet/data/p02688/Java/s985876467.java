import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int N2 = Integer.parseInt(sc.next());
    int N3 = 0;
    for (int i = 0; i > (N+N2); i++) {
    	if(i == 0) {
			N3 = Integer.parseInt(sc.next());
    	} else {
			int N4 = Integer.parseInt(sc.next());
    	}
    }
    System.out.println(N-N3);

  }
}