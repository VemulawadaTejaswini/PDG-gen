import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        int cnt = 1;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pos += l[i];
            if (pos <= x) {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
