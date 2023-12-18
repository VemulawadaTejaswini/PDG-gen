import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }

        String[] ans = solve(H, W, S);
        for (int i=0; i<H; i++) {
            System.out.println(ans[i]);
        }
    }

    private static String[] solve(int H, int W, String[] S) {
        String[] ans = new String[H];

        for (int h=0; h<H; h++) {
            ans[h] = "";
            for (int w=0; w<W; w++) {
                if (S[h].charAt(w) == '#') {
                    ans[h] = ans[h] + S[h].charAt(w);
                } else {
                    ans[h] = ans[h] + count(h, w, H, W, S);
                }
            }
        }

        return ans;
    }

    private static int count(int h, int w, int H, int W, String[] S) {
        int count = 0;

        for (int i=h-1; i<=h+1; i++) {
            for (int j=w-1; j<=w+1; j++) {
                if (i < 0 || j < 0 || i >= H || j >= W) continue;

                if (S[i].charAt(j) == '#') count++;
            }
        }

        return count;
    }
}
