import java.util.Scanner;

public class Main {

    static int len;
    static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        len = s.length();

        System.out.println(dfs(1, 0, 0L));
        sc.close();
    }

    private static long dfs(int idx, int prePlus, long tmpSum) {
        long ret = 0L;
        if(idx < len){
            ret += dfs(idx+1, prePlus, tmpSum);
            ret += dfs(idx+1, idx, tmpSum + Long.parseLong(s.substring(prePlus, idx)));
        }else{
            ret = tmpSum + Long.parseLong(s.substring(prePlus, idx));
        }
        return ret;
    }

}
