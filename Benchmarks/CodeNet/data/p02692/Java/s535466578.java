import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        String[] sousa = new String[n];
        String s1 = sc.next();
        for (int i=1;i<=n;i++) {
            String s2 = "";
            if (sc.hasNext()) {
                s2 = sc.next();
            }
            if (s1.equals("AB")) {
                if (a==0 && b==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (a>b) {
                        a--;
                        b++;
                        sousa[i] = "B";
                    } else if (a==b && s2.equals("BC")) {
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
            if (s1.equals("AC")) {
                if (a==0 && c==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (a>c) {
                        a--;
                        c++;
                        sousa[i] = "C";
                    } else if (a==c && s2.equals("BC")) {
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
            if (s1.equals("BC")) {
                if (b==0 && c==0) {
                    System.out.println("No");
                    return;
                } else {
                    if (b>c) {
                        b--;
                        c++;
                        sousa[i] = "C";
                    } else if (b==c && s2.equals("AC")) {
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
            s1 = s2;
        }
        System.out.println("Yes");
        for (int i=0;i<n;i++) {
            System.out.println(sousa[i]);
        }
    }
}
