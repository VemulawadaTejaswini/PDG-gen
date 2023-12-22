import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s = sc.next();
            
            String a = s.substring(0, s.indexOf("+"));
            String b = s.substring(s.indexOf("+")+1, s.indexOf("="));
            String c = s.substring(s.indexOf("=")+1, s.length());
            
            boolean bo = true;
            
            for (Integer i = 0; i < 10; i++) {
                if (i==0 && a.charAt(0)=='X' && a.length() >= 2) continue;
                if (i==0 && b.charAt(0)=='X' && b.length() >= 2) continue;
                if (i==0 && c.charAt(0)=='X' && c.length() >= 2) continue;
                BigDecimal ia = new BigDecimal(a.replace("X", i.toString()));
                BigDecimal ib = new BigDecimal(b.replace("X", i.toString()));
                BigDecimal ic = new BigDecimal(c.replace("X", i.toString()));
                
                if (ia.add(ib).compareTo(ic) == 0) {
                    System.out.println(i);
                    bo = false;
                    break;
                }
            }
            if (bo) System.out.println("NA");
        }
    }
}