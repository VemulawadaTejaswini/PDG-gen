import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String r = "";
        if(k>1) {
            r = s.substring(0, k-1);
        }
        r += s.substring(k-1, k).toLowerCase();
        if(k<n) {
            r += s.substring(k, n);
        }
        System.out.println(r);
    }
}
