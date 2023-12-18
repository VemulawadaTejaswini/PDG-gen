
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in;

    private static String s, t;
    private static int[][] mem;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        s = in.next();
        t = in.next();

        mem = new int[s.length()][t.length()];

        for(int i=0; i<mem.length; i++) Arrays.fill(mem[i], -1);

//        int ans = solve(0, 0);

        StringBuilder sb = new StringBuilder();

        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()) {
            if (s.charAt(i)==t.charAt(j)) {
                sb.append(s.charAt(i));
                i++;
                j++;
            } else if (solve(i, j)==solve(i+1, j)) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(sb);


	}

    private static int solve(int i, int j) {
        if (i>=s.length() || j>=t.length()) {
            return 0;
        }

        if (mem[i][j]!=-1) return mem[i][j];

        int ans=0;

        if (s.charAt(i)==t.charAt(j)) {
            ans = 1+solve(i+1, j+1);
        } else {
            ans = Math.max(solve(i+1, j), solve(i, j+1));
        }

        return mem[i][j]=ans;
    }


}
