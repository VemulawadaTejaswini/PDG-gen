import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long a1 = x*h;
        long a2 = (w-x)*h;
        long b1 = y*w;
        long b2 = (h-y)*w;

        long min1 = Math.min(a1,a2);
        long min2 = Math.min(b1,b2);

        long ans = Math.max(min1,min2);
        System.out.println(ans);
        if(min1 == min2) System.out.println(1);
        else System.out.println(0);
    }
}