import java.util.*;
public class Main {
  public static void main(String...args) {
	final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    while(true) {
		if(A < B - 1)
          A++;
      	else
          A--;
      	if(A == 0) {
          System.out.println("Borys");
          break;
        }
		if(A + 1 < B)
          B--;
      	else
          B++;
      	if(B == N + 1) {
          System.out.println("Alice");
          break;
        }
    }
  }
}