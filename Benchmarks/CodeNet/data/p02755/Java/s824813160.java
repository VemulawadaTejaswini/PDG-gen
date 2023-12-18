import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int A = itr.nextInt();
        int B = itr.nextInt();

        for (int i = B * 10; i < (B + 1) * 10; i++) {
            if ((i * 8 / 100) == A) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}	