import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
      	double B = sc.nextDouble();
      	double ans = A*B;
      	double ans2 = Math.floor(ans);
      	long ans3 = (long)ans2;
      	System.out.println(ans3);
    }
}