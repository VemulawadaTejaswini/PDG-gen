import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double ra = Math.sqrt(a);
        double rb = Math.sqrt(b);
        double rc = Math.sqrt(c);
        System.out.println(ra+rb < rc?"Yes":"No");
    }
}