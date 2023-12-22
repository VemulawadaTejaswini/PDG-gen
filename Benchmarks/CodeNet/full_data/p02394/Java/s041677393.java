import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        String str = out.nextLine();
        String[] sss = str.split(" ");
        int a = Integer.parseInt(sss[0]);
        int b = Integer.parseInt(sss[1]);
        int c = Integer.parseInt(sss[2]);
        int d = Integer.parseInt(sss[3]);
        int e = Integer.parseInt(sss[4]);

        if (d - e >= 0 && c - e >= 0 && a - c >= e && b - d >= e) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}