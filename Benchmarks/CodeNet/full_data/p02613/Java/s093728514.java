import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        int[] c = new int[4];
        for (int i = 0; i < S.length; i++) {
            S[i] = sc.next();
            if (S[i].equals("AC")) {
                c[0]++;
            } else if (S[i].equals("WA")) {
                c[1]++;
            } else if (S[i].equals("TLE")) {
                c[2]++;
            } else {
                c[3]++;
            }
        }

        System.out.println("AC x " + c[0]);
        System.out.println("WA x " + c[1]);
        System.out.println("TLE x " + c[2]);
        System.out.println("RE x " + c[3]);

        sc.close();
    }
}