import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        
        int taste = 0;
        for (int i = 1; i <= N; i += 1) {
            taste += L + i - 1;
        }
        
        int i = 1 - L;
        if (i <= 1) {
            taste -= L;
        } else if (i >= N) {
            taste -= L + N - 1;
        }
        System.out.println(taste);
    }
}
