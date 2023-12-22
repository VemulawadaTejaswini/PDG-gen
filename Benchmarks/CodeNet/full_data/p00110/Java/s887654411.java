import java.util.Scanner;

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
                Double ia = Double.parseDouble(a.replace("X", i.toString()));
                Double ib = Double.parseDouble(b.replace("X", i.toString()));
                Double ic = Double.parseDouble(c.replace("X", i.toString()));
                
                if (ia + ib == ic) {
                    System.out.println(i);
                    bo = false;
                    break;
                }
            }
            if (bo) System.out.println("NA");
        }
    }
}