import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), m = sc.nextDouble(), d = sc.nextDouble();
        long nn = (long) n, dd = (long) d;
        double count = 0;
        for (long i = 1; i <= nn; i++) {
            if(i+dd <= nn) {
                count++;
            }
            if(i-dd >= 1) {
                count++;
            }
        }
        double temp = count / (n*n);
        if(d==0) temp = 1 / n;
        //System.out.println(temp);
        System.out.println((m - 1.0) * temp);
    }
}
