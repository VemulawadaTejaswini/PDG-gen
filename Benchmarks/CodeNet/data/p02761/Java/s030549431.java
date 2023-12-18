import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] s = new int[m][2];
        for(int i=0; i<m; i++) {
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt();
        }
        int[] ss = new int[3];
        boolean[] bb = new boolean[3];
        for(int i=0; i<m; i++) {
            int a = s[i][0];
            if(bb[a-1] == false && ss[a-1] == 0) {
                ss[a-1] = s[i][1];
                bb[a-1] = true;
            } else if(bb[a-1] == true && ss[a-1] > s[i][1]) {
                ss[a-1] = s[i][1];
            }
        }
        int ans = (ss[0] * 100) + (ss[1] * 10) + (ss[2]);
        int length = String.valueOf(ans).length();
        if(length == n) System.out.println(ans);
        else System.out.println(-1);
    }
}
