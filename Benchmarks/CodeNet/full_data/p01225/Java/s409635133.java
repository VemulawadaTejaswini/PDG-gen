import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int v=0; v<n; ++v) {
            char s = ' ';
            int[] nums = new int[9];
            ArrayList<Integer> R = new ArrayList<>();
            ArrayList<Integer> G = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            for (int i=0; i<9; ++i) {
                nums[i] = sc.nextInt();
            }
            for (int i=0; i<9; ++i) {
                s = sc.next().charAt(0);
                if (s == 'R') {
                    R.add(nums[i]);
                }
                if (s == 'G') {
                    G.add(nums[i]);
                }
                if (s == 'B') {
                    B.add(nums[i]);
                }
            }
            if (R.size() % 3 + G.size() % 3 + B.size() % 3 != 0) {
                System.out.println(0);
                continue;
            }
            System.out.println((comb(R) && comb(G) && comb(B)) ? 1 : 0);
        }
        sc.close();
    }

    private static boolean comb(ArrayList<Integer> l) {
        if (l.size() == 0) return true;
        int n[] = connvert(l);
        Arrays.sort(n);
        return check(n, 0, n.length);
    }

    private static boolean check(int[] n, int r, int l) {
        int[][] pos = {
            {0,1,1,1,1,2,2,2,2},
            {0,0,1,1,2,2},
            {0,1,2},
            {0,0,0},
        };
        int listlen = l - r;
        if (listlen == 9) {
            for (int i=0; i<9; ++i) {
                if (n[i+r] - n[r] != pos[0][i]) {
                    return check(n, 0, 3) && check(n, 3, 9) || check(n, 0, 6) && check(n, 6, 9);
                }
            }
        } else if (listlen == 6) {
            for (int i=0; i<6; ++i) {
                if (n[i+r] - n[r] != pos[1][i]) {
                    return check(n, r, r+3) && check(n, r+3, r+6);
                }
            }
        } else {
            boolean flag = true;
            for (int i=0; i<3; ++i) {
                if (n[i+r] - n[r] != pos[2][i]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                for (int i=0; i<3; ++i) {
                    if (n[i+r] - n[r] != pos[3][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static int[] connvert(ArrayList<Integer>l) {
        int[] res = new int[l.size()];
        for (int i=0; i<l.size(); ++i) {
            res[i] = l.get(i);
        }
        return res;
    }
}

