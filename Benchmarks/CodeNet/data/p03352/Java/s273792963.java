import java.util.Scanner;

class Rp1ABC097B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int g = 0;
        for (int b = 1; a <= x; a++) {
            for (int p = 2; b <= x; b++) {
                if (a * b > x) {
                    break;
                } else {
                    g = (int)Math.pow(a,b);
                }
            }
        }
        System.out.print(g);
        sc.close();
    }
}