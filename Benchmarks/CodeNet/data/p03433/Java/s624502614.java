import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        int pittari = N % 500;
        int haraeru = pittari - A;
        
        if (haraeru < 0 || pittari == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}