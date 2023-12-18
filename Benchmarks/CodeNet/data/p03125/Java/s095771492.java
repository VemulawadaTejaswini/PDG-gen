import java.util.*;

public class Main{
	public static main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
          out.println(A + B);
        } else {
          out.println(B - A);
        }
    }
}