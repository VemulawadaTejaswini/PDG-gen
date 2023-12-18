import java.util.Scanner;

class Main {

    static long ans;
    static int[] k_list;

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var n = scaner.nextInt();
        var m = scaner.nextInt();

        int[] h_list = new int[n];
        for(int i=0; i<n; i++) {
            h_list[i] = scaner.nextInt();
        }

        boolean[] bad = new boolean[n];
        for (int i = 0; i < m; i++) {
            int a = scaner.nextInt() - 1;
            int b = scaner.nextInt() - 1;

            if (h_list[a] <= h_list[b]) {
                bad[a] = true;
            } else {
                bad[b] = true;
            }
        }

        int ans = n;
        for(boolean e: bad) {
            if(!e) ans--;
        }

        System.out.println(ans);
        scaner.close();
    }

}
