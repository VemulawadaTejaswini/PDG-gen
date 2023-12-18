import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i < N; i++) {
            int P = sc.nextInt();
            if (i == P) {
                i++;
                count++;
            }
        }
        System.out.println(count);
    }    
}
