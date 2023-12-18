import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long p = scan.nextLong();
        long m = scan.nextLong();
        long ans = p;
        while (p > m){
            p = p%m;
            ans = Math.min(ans,p);
        }
        System.out.println(Math.min(ans,Math.abs(p-m)));
    }
}
