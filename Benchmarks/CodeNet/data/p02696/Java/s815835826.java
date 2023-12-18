import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
      	long n = sc.nextInt();
      long r = 0;
      
       r = (long)(a*n/b) - a * (long)(n/b);
            System.out.println(r);
    }
}