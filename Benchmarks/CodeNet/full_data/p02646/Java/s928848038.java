import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long v = sc.nextInt();
        long b = sc.nextInt();
        long w = sc.nextInt();
        long t = sc.nextInt();

        long d = Math.abs(a-b);
        if(v <= w) {
            System.out.println("NO");
            return;
        }
        long s = v-w;
        if(s * t >= d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }


}