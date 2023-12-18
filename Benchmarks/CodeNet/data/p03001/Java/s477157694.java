import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(w*h/2);
        if(w/2 == x && h/2 == y) System.out.println(1);
        else System.out.println(0);
    }
}