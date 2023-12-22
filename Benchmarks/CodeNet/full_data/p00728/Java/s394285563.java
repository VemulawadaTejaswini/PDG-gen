import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        while((n = scn.nextInt()) > 0) {
            int[] ary = new int[n];
            for(int i = 0; i < n; i++) {
                ary[i] = scn.nextInt();
            }
            Arrays.sort(ary);
            int sum = 0;
            for(int i = 1; i < n - 1; i++) {
                sum += ary[i];
            }
            System.out.println(sum / (n - 2));
        }
    }
}