import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int tempt = Integer.parseInt(sc.next());
        int tempa = Integer.parseInt(sc.next());
        for (int i = 0; i < n - 1; i++) {
            int t = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            if (t >= tempt && a >= tempa) {
                tempt = t;
                tempa = a;
            } else {
                int ratiot = (int) Math.ceil(tempt / (double) t);
                int ratioa = (int) Math.ceil(tempa / (double) a);
                tempt = Math.max(ratiot, ratioa) * t;
                tempa = Math.max(ratiot, ratioa) * a;
            }
        }
        System.out.println(tempt + tempa);
    }
}