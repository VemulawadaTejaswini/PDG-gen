import java.util.Arrays;
import java.util.Scanner;

//0631
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l[] = new int[m], a = 0;
        for (int i = 0; i < m; i++) {
            l[i] = n - sc.nextInt();
            sc.nextInt();
            a += l[i] > 0 ? l[i] : 0;
        }
        Arrays.sort(l);
        System.out.println(a - l[m - 1]);
    }
}

