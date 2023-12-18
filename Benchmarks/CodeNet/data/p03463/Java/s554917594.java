import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
 
        int diff = Math.abs(A-B)%2;
 
        if(diff == 0) {
            System.out.println("Alice");
        } else if (diff >= 1) {
            System.out.println("Borys");
        } else {
            System.out.println("Draw");
        }
    }
}


