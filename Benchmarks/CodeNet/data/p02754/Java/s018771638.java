import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scan s = new Scan();
        int N = s.nI();
        int A = s.nI();
        int B = s.nI();
        if(A == 0){
            System.out.println(0);
        }else{
            int rest = N % (A+B);
            int result = rest - A <= 0 ? A * (N / (A+B)) + rest : A * (N / (A+B)) + rest - B;
            System.out.println(result);
        }
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
