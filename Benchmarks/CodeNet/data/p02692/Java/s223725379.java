import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        String[] sousa = new String[n];
        for (int i=0;i<n;i++) {
            String s = sc.next();
            if (s.equals("AB")) {
                if (a==0 && b==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (a>b) {
                        a--;
                        b++;
                        sousa[i] = "B";
                    } else {
                        a++;
                        b--;
                        sousa[i] = "A";
                    }
                }
            }
            if (s.equals("AC")) {
                if (a==0 && c==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (a>c) {
                        a--;
                        c++;
                        sousa[i] = "C";
                    } else {
                        a++;
                        c--;
                        sousa[i] = "A";
                    }
                }
            }
            if (s.equals("BC")) {
                if (b==0 && c==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (b>c) {
                        b--;
                        c++;
                        sousa[i] = "C";
                    } else {
                        b++;
                        c--;
                        sousa[i] = "B";
                    }
                }
            }
        }
        System.out.println("Yes");
        for (int i=0;i<n;i++) {
            System.out.println(sousa[i]);
        }
    }
}
