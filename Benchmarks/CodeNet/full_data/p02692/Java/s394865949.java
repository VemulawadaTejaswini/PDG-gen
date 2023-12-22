import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<n; i++) {
            String str = sc.next();
            if (str.equals("AB")) {
                if (a < b) {
                    a += 1;
                    b -= 1;
                    sb.append("A\n");
                } else {
                    a -= 1;
                    b += 1;
                    sb.append("B\n");
                }
                if (a < 0 || b < 0) {
                    System.out.print("No");
                    return;
                }
            } else if (str.equals("AC")) {
                if (a < c) {
                    a += 1;
                    c -= 1;
                    sb.append("A\n");
                } else {
                    a -= 1;
                    c += 1;
                    sb.append("C\n");
                }
                if (a < 0 || c < 0) {
                    System.out.print("No");
                    return;
                }
            } else {
                if (b < c) {
                    b += 1;
                    c -= 1;
                    sb.append("B\n");
                } else {
                    b -= 1;
                    c += 1;
                    sb.append("C\n");
                }
                if (b < 0 || c < 0) {
                    System.out.print("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
        System.out.println(sb.toString());

    }
}
