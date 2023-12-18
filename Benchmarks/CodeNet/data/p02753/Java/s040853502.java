import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scan s = new Scan();
        String S = s.nS();
        String res = "Yes";
        if(S.equals("AAA") || S.equals("BBB"))res = "No";
        System.out.println(res);
    }
    
    static class Scan{
        private static Scanner sc = new Scanner(System.in);
        public static int nI(){
            return Integer.parseInt(sc.next());
        }
        public static long nL(){
            return Long.parseLong(sc.next());
        }
        public static String nS(){
            return sc.next();
        }
        public static double nD(){
            return Double.parseDouble(sc.next());
        }
    }
}
