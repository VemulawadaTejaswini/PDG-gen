import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] list = new String[m];
        for (int i = 0; i < m; i++) {
            int p = scan.nextInt();
            long y = scan.nextLong();
            list[i] = y+"_"+i + "_" +p;
        }
        int[] n_cnt = new int[n];
        String[] ans = new String[m];
        Arrays.sort(list);
        for (int i = 0; i < m; i++) {
            String[] s = list[i].split("_");
            n_cnt[Integer.parseInt(s[2])-1]++;
            ans[Integer.parseInt(s[1])] = String.format("%06d", Integer.parseInt(s[2])) + String.format("%06d", n_cnt[Integer.parseInt(s[2])-1]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }
}
