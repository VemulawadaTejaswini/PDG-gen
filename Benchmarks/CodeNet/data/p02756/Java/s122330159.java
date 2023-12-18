import java.util.Scanner;

public class Main158D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < Q; i++) {
            int qn = sc.nextInt();
            if (qn == 1 && flag == true) {
                flag = false;
            } else if (qn == 1 && flag == false) {
                flag = true;
            } else {
                int qn2 = sc.nextInt();
                if (flag == true) {
                    if (qn2 == 1) {
                        S = sc.next() + S;
                    } else {
                        S = S + sc.next();
                    }
                } else {
                    if (qn2 == 1) {
                        S = S + sc.next();
                    } else {
                        S = sc.next() + S;
                    }
                }

            }

        }
        // System.out.println(flag);
        if (flag == true) {
            System.out.println(S);
        } else {
            // System.out.println(flag);
            char[] SC = S.toCharArray();
            for (int i = 0; i < S.length(); i++) {
                System.out.print(SC[S.length() - 1 - i]);

            }
        }
    }
}