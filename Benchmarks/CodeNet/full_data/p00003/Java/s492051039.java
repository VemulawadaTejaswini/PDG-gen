import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int i = 0, n = scn.nextInt(); i < n; i++) {
            int[] ary = {scn.nextInt(), scn.nextInt(), scn.nextInt()};
            Arrays.sort(ary);
            boolean flg = ary[0] * ary[0] + ary[1] * ary[1] == ary[2] * ary[2];
            System.out.println(flg ? "YES" : "NO");
        }
    }
}