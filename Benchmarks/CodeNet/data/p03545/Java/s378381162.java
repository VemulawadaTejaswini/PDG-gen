import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int tmp;
        int a = s / 1000, b = s % 1000 / 100, c = s % 1000 % 100 / 10, d = s % 10;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (i == 0) {
                        tmp = a + b;
                    } else {
                        tmp = a - b;
                    }
                    if (j == 0) {
                        tmp += c;
                    } else {
                        tmp -= c;
                    }
                    if (k == 0) {
                        tmp += d;
                    } else {
                        tmp -= d;
                    }
                    if (tmp == 7) {
                        String op1 = i == 0 ? "+" : "-";
                        String op2 = j == 0 ? "+" : "-";
                        String op3 = k == 0 ? "+" : "-";
                        System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
                        return;
                    }
                }
            }
        }
    }
}
