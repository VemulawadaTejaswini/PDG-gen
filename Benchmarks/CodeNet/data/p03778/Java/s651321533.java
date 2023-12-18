import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if(b<a) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(Math.max(0,(b-(a+W))));

    }
}