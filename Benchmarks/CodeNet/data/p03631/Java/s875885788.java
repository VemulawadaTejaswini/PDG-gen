import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int N = sc.nextInt();
            if((N % 10) == (N /100)) System.out.println("Yes");
            else System.out.println("No");
        }    
}