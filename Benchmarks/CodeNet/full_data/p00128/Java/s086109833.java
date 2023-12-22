import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = false;
        while (sc.hasNext()) {
            String l = sc.next();
            while (l.length() < 5)
                l = "0" + l;
            if (f)
                System.out.println();
            f = true;
            String s = "";
            for (int i = 0; i < 40; i++) {
                int t = l.charAt(i % 5) - '0';
                if (i < 5)
                    s += t < 5 ? "*" : " ";
                else if (i < 10)
                    s += t < 5 ? " " : "*";
                else if (i < 15)
                    s += "=";
                else
                    s += t % 5 == i / 5 - 3 ? " " : "*";
                if (i % 5 == 4)
                    s += "\n";
            }
            System.out.print(s);
        }
    }
}

