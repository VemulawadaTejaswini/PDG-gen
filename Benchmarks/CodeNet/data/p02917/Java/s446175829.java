import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] b = new int[n - 1];
        for(int i = 0; i < n - 1; i++){
            b[i] = scan.nextInt();
        }
        int out = 0;
        for(int i = 1; i < n - 1; i++){
            out += Math.min(b[i], b[i - 1]);
        }
        out += b[0];
        out += b[n - 2];
        System.out.println(out);
    }
}