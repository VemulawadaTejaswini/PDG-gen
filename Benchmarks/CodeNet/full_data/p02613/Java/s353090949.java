import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        String res;

        for (int i = 0; i < N; i++) {
            res = sc.next();

            if (res.equals("AC")) {
                ac++;
            } else if (res.equals("WA")) {
                wa++;
            } else if (res.equals("TLE")) {
                tle++;
            } else {
                re++;
            }
        }

        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
    }

}
