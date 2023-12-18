import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 1; i <= 1000; i++) {
            if((int) (i*0.08) == A && (int) (i*0.10) == B) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
        sc.nextLine();
    }
}