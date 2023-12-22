import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double ans = 360 / X;
      	double ans2 = Math.ceil(ans);
            System.out.println((int)ans2);
    }
}