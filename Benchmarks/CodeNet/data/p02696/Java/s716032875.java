import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
      	long n = sc.nextLong();
      	double f1 = a*n/b;
      	double f2 = n/b;
      	int r = (int)f1 - a * (int)f2;
            System.out.println(r);
    }
}