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

        String[] arr = new String[n];
        for (int i=0; i<n; i++) arr[i] = sc.next();

        for (int i=0; i<n; i++) {
            if (a + b + c == 0) {
                System.out.println("No");
                return;
            }
            if (arr[i].equals("AB")) {
                if (a + b + c == 2 && i != n-1 && a == 1 && b == 1 && !arr[i].equals(arr[i+1]) ) {
                    if (arr[i].charAt(0) == arr[i+1].charAt(0)) {
                        a += 1;
                        b -= 1;
                    } else {
                        a -= 1;
                        b += 1;
                    }
                } else {
                    if (a < b) {
                        a += 1;
                        b -= 1;
                        sb.append("A\n");
                    } else {
                        a -= 1;
                        b += 1;
                        sb.append("B\n");
                    }
                }
                if (a < 0 || b < 0) {
                    System.out.print("No");
                    return;
                }
            } else if (arr[i].equals("AC")) {
                if (a + b + c == 2 && i != n-1 && a == 1 && c == 1 && !arr[i].equals(arr[i+1]) ) {
                    if (arr[i].charAt(0) == arr[i+1].charAt(0)) {
                        a += 1;
                        c -= 1;
                    } else {
                        a -= 1;
                        c += 1;
                    }
                } else {
                    if (a < c) {
                        a += 1;
                        c -= 1;
                        sb.append("A\n");
                    } else {
                        a -= 1;
                        c += 1;
                        sb.append("C\n");
                    }
                }
                if (a < 0 || c < 0) {
                    System.out.print("No");
                    return;
                }
            } else {
                if (a + b + c == 2 && i != n-1 && b == 1 && c == 1 && !arr[i].equals(arr[i+1]) ) {
                    if (arr[i].charAt(1) == arr[i+1].charAt(1)) {
                        c += 1;
                        b -= 1;
                    } else {
                        c -= 1;
                        b += 1;
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
