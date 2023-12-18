import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] one = new int[b];
        boolean bl = false;
        for (int i = 0; i < one.length; i++) {
            one[i] = 1;
        }
        
        for (int i = 0; i < one.length; i++) {
            a -= one[i];
            if (a % 500 == 0) {
                bl = true;
            }
        }
        
        if (bl) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
