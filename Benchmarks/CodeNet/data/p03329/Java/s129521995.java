import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x = N;
        for (int i=0; i < N + 1; i++) {
            int count = 0;
            int t = i;
            while (t > 0) {
                count += t % 9;
                t = t / 9;
            }
            t = N - i;
            while (t > 0) {
                count += t % 6;
                t = t / 6;
            }
            if (x > count) x = count;
        }
        
        System.out.println(x);
    }
}
