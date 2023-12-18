public class Main {

    private static int solve(int n, int c, int k, int[] ts) {
        int count = 0;
        int r = 0;
        int maxT = -1;
        for (int t : ts) {
            if (maxT == -1) {
                maxT = t + k;
            }

            if (maxT >= t && count < c) {
                count++;
            } else {
                r++;
                count = 1;
                maxT = t + k;
            }
        }
        if (count > 0) {
            r++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        Arrays.sort(ts);
        System.out.println(solve(n, c, k, ts));
    }
}