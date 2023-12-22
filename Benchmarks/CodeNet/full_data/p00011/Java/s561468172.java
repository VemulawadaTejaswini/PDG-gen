import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] num = new int[w];
        for (int i=0; i<w; ++i) {
            num[i] = i+1;
        }

        for (int i=0; i<n; ++i) {
            String[] s = sc.next().split(",", 0);
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;

            num[a] = num[a] ^ num[b];
            num[b] = num[a] ^ num[b];
            num[a] = num[a] ^ num[b];
        }
        for (int i=0; i<w; ++i) {
            System.out.println(num[i]);
        }
        sc.close();
    }
}

