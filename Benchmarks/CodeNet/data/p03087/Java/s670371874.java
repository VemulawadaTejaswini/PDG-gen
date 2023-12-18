import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q ; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++) {
            char[] ss = s.toCharArray();
            int ans = 0;
            for(int j = l[i] - 1; j < r[i] -1; j++) {
                if(ss[j] == 'A' && ss[j + 1]  == 'C') {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}