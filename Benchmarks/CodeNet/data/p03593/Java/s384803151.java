import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] num = new int[26];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                num[s.charAt(j)-'a']++;
            }
        }

        boolean ans = true;
        if (H%2 == 0 && W%2 == 0) {
            int num4 = H*W/4;
            for (int i = 0; i < 26; i++) {
                if (num[i] >= 4) {
                    int a = Math.min(num[i]/4, num4);
                    num[i] -= a*4;
                    num4 -= a;
                }
            }
            int others = 0;
            for (int i = 0; i < 26; i++) {
                others += num[i];
            }
            ans = num4 == 0 && others == 0;
        } else if (H%2 == 1 && W%2 == 1) {
            int num4 = (H-1)*(W-1)/4;
            for (int i = 0; i < 26; i++) {
                if (num[i] >= 4) {
                    int a = Math.min(num[i]/4, num4);
                    num[i] -= a*4;
                    num4 -= a;
                }
            }
            int num2 = ((H-1)+(W-1))/2;
            for (int i = 0; i < 26; i++) {
                if (num[i] >= 2) {
                    int a = Math.min(num[i]/2, num2);
                    num[i] -= a*2;
                    num2 -= a;
                }
            }
            int others = 0;
            for (int i = 0; i < 26; i++) {
                others += num[i];
            }
            ans = num4 == 0 && num2 == 0 && others == 1;
        } else {
            int odd = H%2 == 1 ? H : W;
            int even = H%2 == 1 ? W : W;

            int num4 = (odd-1)*even/4;
            for (int i = 0; i < 26; i++) {
                if (num[i] >= 4) {
                    int a = Math.min(num[i]/4, num4);
                    num[i] -= a*4;
                    num4 -= a;
                }
            }
            int num2 = even/2;
            for (int i = 0; i < 26; i++) {
                if (num[i] >= 2) {
                    int a = Math.min(num[i]/2, num2);
                    num[i] -= a*2;
                    num2 -= a;
                }
            }
            int others = 0;
            for (int i = 0; i < 26; i++) {
                others += num[i];
            }
            ans = num4 == 0 && num2 == 0 && others == 0;
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
