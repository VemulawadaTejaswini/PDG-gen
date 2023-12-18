import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();

        if(Math.abs(a-b) > d * (n-1)){
            System.out.println("NO");
            return;
        }

        if(n%2 == 0){
            if(Math.abs(a-b) % d + d > (d-c) * (n-1)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }else{
            if(Math.abs(a-b) % d > (d-c) * (n-1)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}