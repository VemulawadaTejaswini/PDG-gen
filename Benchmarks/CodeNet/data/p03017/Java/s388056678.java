import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() + 2;
        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        int D = sc.nextInt() - 1;

        String str = sc.next();
        char c[] = str.toCharArray();

        //c[A] = 'A';
        //c[B] = 'B';
        //c[C] = 'C';
        //c[D] = 'D';
        boolean flag = true;
        for (int i = B; i < c.length; i++) {
            if (c[i + 1] != '.' && c[i + 2] != '.') {// == '#'
                flag = false;
                break;
            }
            if (i + 1 == D || i + 2 == D) {
                break;
            }
            
        }
        for (int i = A; i < c.length; i++) {
            if (c[i + 1] != '.' && c[i + 2] != '.') {
                flag = false;
                break;
            }
            if (i + 1 == C || i + 2 == C) {
                break;
            }
        }

        if (C > D) {
            int num = str.indexOf("...", B);
            if (num == -1) {
                if (c[D - 1] == '#' || c[D + 1] == '#') {
                    flag = false;
                }
            } else if (num == D || num + 2 == D) {
                flag = false;
            } else if (num == C || num + 1 == C || num + 2 == C) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
