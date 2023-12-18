
import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A + B == 0){
            System.out.println(0);
        }
        int sum = N / (A + B) * A + Math.min(N % (A + B), A);
        System.out.println(sum);
    }
}
