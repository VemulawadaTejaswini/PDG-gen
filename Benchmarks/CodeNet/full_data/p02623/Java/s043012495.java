import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();
        var m = scaner.nextInt();
        var k = scaner.nextInt();

        var a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scaner.nextInt();
        }

        var b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scaner.nextInt();
        }

        var ans = 0;
        var ap = 0;
        var bp= 0;
        while(0 < k) {
            int time;
            if (n != ap && m != bp) {
                if (a[ap] < b[bp]) {
                    time = a[ap];
                    ap++;
                } else {
                    time = b[bp];
                    bp++;
                }
            } else if (n != ap) {
                time = a[ap];
                ap++;
            } else if (m != bp) {
                time = b[bp];
                bp++;
            } else {
                break;
            }

            if (time <= k) {
                k -= time;
                ans++;
            }


        }


        System.out.println(ans);

        scaner.close();
    }

}
