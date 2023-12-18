import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        char[] c = s.toCharArray();

        c[k - 1] += 0X20;

        for (int i = 0; i < n; i++) {
            System.out.print(c[i]);
        }

        System.out.println();

        sc.close();

    }
}