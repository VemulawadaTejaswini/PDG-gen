import java.util.*;

public class Main {

    private static int mod = 1000000007;
    private static int[][] c;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int n = c.length;
        int[] res = new int[n];

        int pos = 0;
        while(pos < n) {
            int start = pos;
            int rmax = pos;
            while(c[pos] == 'R') {
                rmax = pos;
                pos++;
            }
            int lmin = pos;
            int end = pos;
            while(pos < n && c[pos] == 'L') {
                end = pos;
                pos++;
            }
            for(int i=start; i<=end; i++)  {
                if(i % 2 == rmax % 2) {
                    res[rmax]++;
                } else {
                    res[lmin]++;
                }
            }
        }
        System.out.print(res[0]);
        for(int i=1; i<n; i++) {
            System.out.print(" ");
            System.out.print(res[i]);
        }
    }

}
