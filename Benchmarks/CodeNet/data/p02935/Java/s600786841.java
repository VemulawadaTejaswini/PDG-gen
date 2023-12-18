import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        double x = 0;

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        for (int i = 0; i < n -1; i++) {
            if (i == 0) {
                x = ((ary[i] + ary[i+1]) /2);
            } else {
                x = (x + ary[i+1]) /2;
            }
        }
        System.out.print(x);
    }
}