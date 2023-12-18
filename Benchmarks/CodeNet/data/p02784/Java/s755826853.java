import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();
        long checkAns = 0;
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            checkAns += a;
        }
        if(checkAns >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
