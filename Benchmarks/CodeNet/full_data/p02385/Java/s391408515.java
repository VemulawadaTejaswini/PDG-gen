import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        Dice d1 = new Dice(lines);
        lines = br.readLine().split(" ");
        Dice d2 = new Dice(lines);
        d1.getRight(d2.getNumber(0), d2.getNumber(1));
        if (d1.check() && d2.check()) {
            System.out.println("Yes");
            return;
        }
        for (int i = 0; i < 6; i++) {
            if (!d1.getNumber(i).equals(d2.getNumber(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class Dice {
    String[] s = new String[6];
    int[] d = { 0, 1, 2 };
    static String a = "";
    static String b = "";

    Dice(String[] s) {
        this.s = s;
    }

    boolean check() {
        int aCount = 0;
        int bCount = 0;
        for (String n : s) {
            if (a.isEmpty()) {
                a = n;
                aCount++;
                continue;
            }
            if (a.equals(n)) {
                aCount++;
                continue;
            }
            if (b.isEmpty()) {
                b = n;
                bCount++;
                continue;
            }
            if (b.equals(n)) {
                bCount++;
                continue;
            }
            return false;
        }
        if (aCount * bCount == 5) {
            return true;
        }
        return false;
    }

    String getNumber() {
        return s[d[0]];
    }

    String getNumber(int n) {
        n = n < 3 ? d[n] : 5 - d[5 - n];
        return s[n];
    }

    void roll(char n) {
        int a = 0;
        int b = 0;
        switch (n) {
        case 'N':
            a = 0;
            b = 1;
            break;
        case 'E':
            a = 2;
            b = 0;
            break;
        case 'S':
            a = 1;
            b = 0;
            break;
        case 'W':
            a = 0;
            b = 2;
            break;
        case 'H':
            a = 1;
            b = 2;
            break;
        }
        int temp = d[a];
        d[a] = d[b];
        d[b] = 5 - temp;
    }

    String getRight(String[] list) {
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(list[0])) {
                break;
            }
            roll('N');
        }
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(list[0])) {
                break;
            }
            roll('W');
        }
        for (int i = 0; i < 3; i++) {
            if (s[d[1]].equals(list[1])) {
                break;
            }
            roll('H');
        }
        return s[d[2]];
    }

    String getRight(String str1, String str2) {
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(str1)) {
                break;
            }
            roll('N');
        }
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(str1)) {
                break;
            }
            roll('W');
        }
        for (int i = 0; i < 3; i++) {
            if (s[d[1]].equals(str2)) {
                break;
            }
            roll('H');
        }
        return s[d[2]];
    }
}