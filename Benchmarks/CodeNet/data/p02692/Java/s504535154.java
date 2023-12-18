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

        String[] arr = new String[n+1];
        for (int i=0; i<n; i++) arr[i] = sc.next();

        for (int i=0; i<n; i++) {
            if (arr[i].equals("AB")) {
                if (a < b) {
                    a += 1;
                    b -= 1;
                    sb.append("A\n");
                } else if (b < a) {
                    b += 1;
                    a -= 1;
                    sb.append("B\n");
                } else {
                    if (arr[i].equals("BC")) {
                        b += 1;
                        a -= 1;
                        sb.append("B\n");
                    } else {
                        a += 1;
                        b -= 1;
                        sb.append("A\n");
                    }
                }

            } else if (arr[i].equals("AC")) {
                if (a < c) {
                    a += 1;
                    c -= 1;
                    sb.append("A\n");
                } else if (c < a) {
                    c += 1;
                    a -= 1;
                    sb.append("C\n");
                } else {
                    if (arr[i].equals("BC")) {
                        c += 1;
                        a -= 1;
                        sb.append("C\n");
                    } else {
                        a += 1;
                        c -= 1;
                        sb.append("A\n");
                    }
                }

            } else {
                if (b < c) {
                    b += 1;
                    c -= 1;
                    sb.append("B\n");
                } else if (c < b) {
                    c += 1;
                    b -= 1;
                    sb.append("C\n");
                } else {
                    if (arr[i].equals("AC")) {
                        c += 1;
                        b -= 1;
                        sb.append("C\n");
                    } else {
                        b += 1;
                        c -= 1;
                        sb.append("B\n");
                    }
                }

            }
        }

        System.out.println("Yes");
        System.out.println(sb.toString());

    }
}
