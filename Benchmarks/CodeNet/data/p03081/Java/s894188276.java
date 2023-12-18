import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] gArr = new int[n];
        char[] qArr = sc.next().toCharArray();

        for (int i=0;i<n;i++) {
            gArr[i] = 1;
        }

        for (int i=0;i<q;i++) {
            char gc = sc.next().charAt(0);
            char qc = sc.next().charAt(0);

            if (qc == 'L') {
                for (int j=0;j<n;j++) {
                    if (qArr[j] == gc && gArr[j] != 0) {
                        if (j != 0) gArr[j-1]+=gArr[j];
                        gArr[j]=0;
                    }
                }
            } else if (qc == 'R') {
                for (int j=n-1;j>=0;j--) {
                    if (qArr[j] == gc && gArr[j] != 0) {
                        if (j != n-1) gArr[j+1]+=gArr[j];
                        gArr[j]=0;
                    }
                }
            }
        }

        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += gArr[i];
        }
        System.out.println(sum);
    }
}