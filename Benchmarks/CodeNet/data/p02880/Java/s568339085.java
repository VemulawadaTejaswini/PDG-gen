import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		
        if (n <= 9) {
            System.out.println("Yes");
        }
        else if ((n == 11)||(n>81)) {
            System.out.println("No");
        } else {
            boolean issosu = true;
            for (int u = 2; u < n; u++) {
                if (n % u == 0) {
                issosu = false;
                }
            }
            if (issosu) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}