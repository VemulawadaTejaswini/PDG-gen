import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
      	long n = sc.nextLong();
      	double f1 = a*n/b;
      	double f2 = n/b;
      	long r = (long)f1 - a * (long)f2;
            System.out.println(r);
    }
}