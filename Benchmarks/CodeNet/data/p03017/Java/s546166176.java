import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 全部インデックスそうさする
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        char map[] = new char[n + 2];
        String s = sc.next();
        sc.close();
        for (int i = 0; i < n; i++) {
            map[i] = s.charAt(i);
        }
        for (int i = a; i < c; i++) {
            char c1 = map[i];
            char c2 = map[i + 1];
            if (c1 == '#' && c2 == '#') {
                System.out.println("No");
            }
        }
        for (int i = b; i < d; i++) {
            char c1 = map[i];
            char c2 = map[i + 1];
            if (c1 == '#' && c2 == '#') {
                System.out.println("No");
                return;
            }
        }
        if (c < d) {
            System.out.println("Yes");
            return;
        }
        for (int i = b - 1; i < d; i++) {
            char c1 = map[i];
            char c2 = map[i + 1];
            char c3 = map[i + 2];
            if (c1 == '.' && c2 == '.' && c3 == '.') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;

    }
}