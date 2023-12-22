import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int m, f, r;
        while((m = load()) >= 0 | (f = load()) >= 0 | (r = load()) >= 0) {
            System.out.println(judge(m, f, r));
        }
    }
    
    private static int load() {
        return scn.nextInt();
    }
    
    private static String judge(int m, int f, int r) {
        String rslt;
        int sum;
        if(m < 0 || f < 0 || (sum = m + f) < 30) {
            rslt = "F";
        } else if(sum > 79) {
            rslt = "A";
        } else if(sum > 64) {
            rslt = "B";
        } else if(sum > 49 || r > 49) {
            rslt = "C";
        } else {
            rslt = "D";
        }
        return rslt;
    }
}