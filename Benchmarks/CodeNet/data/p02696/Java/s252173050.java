import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
      	long n = sc.nextLong();
      	long f1 = (a*n)/b;
      	long f2 = n/b;
      	long r = f1 - (a * f2);
            System.out.println(r);
    }
}