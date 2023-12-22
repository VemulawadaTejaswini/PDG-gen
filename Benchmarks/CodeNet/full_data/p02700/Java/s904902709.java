import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println(Math.ceil(a/d) >= Math.ceil(c/b)? "Yes" : "No");
    }
}