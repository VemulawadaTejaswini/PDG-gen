import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long tempt = Long.parseLong(sc.next());
        long tempa = Long.parseLong(sc.next());
        for (int i = 0; i < n - 1; i++) {
            long t = Long.parseLong(sc.next());
            long a = Long.parseLong(sc.next());
            if (t >= tempt && a >= tempa) {
                tempt = t;
                tempa = a;
            } else {
                long ratiot = (int) Math.ceil(tempt / (double) t);
                long ratioa = (int) Math.ceil(tempa / (double) a);
                tempt = Math.max(ratiot, ratioa) * t;
                tempa = Math.max(ratiot, ratioa) * a;
            }
        }
        System.out.println(tempt + tempa);
    }
}