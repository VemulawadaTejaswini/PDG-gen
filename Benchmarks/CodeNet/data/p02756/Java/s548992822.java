import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scan s = new Scan();
        StringBuffer sb = new StringBuffer();
        sb.append(s.nS());
        int Q = s.nI();
        String x;
        for(int i=0;i<Q;i++){
            int que = s.nI();
            switch(que){
                case 1:
                    sb.reverse();
                    break;
                case 2:
                    int F = s.nI();
                    switch(F){
                        case 1:
                            x = s.nS();
                            sb.insert(0,x);
                            break;
                        case 2:
                            x = s.nS();
                            sb.append(x);
                            break;
                    }
                    break;
            }
        }
        System.out.println(sb);
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
