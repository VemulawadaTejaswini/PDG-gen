import java.util.Scanner;

// 再帰を用いた解法
public class Main {
    private static String s;
    
    private static long solve(long decided, long left, int i){
        if(i==s.length()){
            return decided + left;
        }
        // 左側に+を入れる場合→int(s[i])がleftに。
        long ret1 = solve(decided + left, Character.getNumericValue(s.charAt(i)), i+1);
        // +を入れない→leftが10倍+int(s[i])される
        long ret2 = solve(decided, left*10 + Character.getNumericValue(s.charAt(i)), i+1);
        return ret1 + ret2;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        System.out.println(solve(0,Character.getNumericValue(s.charAt(0)), 1));
    }
}
