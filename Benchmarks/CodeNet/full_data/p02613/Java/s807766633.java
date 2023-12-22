import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // テストケース数
        int n = sc.nextInt();
        // AC or WA or TLE or RE
        String[] s = new String[n];

        int acCount = 0;
        int waCount = 0;
        int tleCount = 0;
        int reCount = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (s[i].equals("AC")) {
                acCount++;
            } else if (s[i].equals("WA")) {
                waCount++;
            } else if (s[i].equals("TLE")) {
                tleCount++;
            } else if (s[i].equals("RE")) {
                reCount++;
            }
        }
        System.out.println("AC x " + acCount);
        System.out.println("WA x " + waCount);
        System.out.println("TLE x " + tleCount);
        System.out.println("RE x " + reCount);
    }
}
