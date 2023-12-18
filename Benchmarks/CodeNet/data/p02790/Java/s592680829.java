import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        StringBuilder sbN = new StringBuilder();
        StringBuilder sbM = new StringBuilder();
        
        for (int i = 0; i < Integer.parseInt(n); i++) {
            sbN.append(m);
        }
        for (int i = 0; i < Integer.parseInt(m); i++) {
            sbM.append(n);
        }
        if (sbN.toString().compareTo(sbM.toString()) < 0) {
            System.out.println(sbN.toString());
        } else {
            System.out.println(sbM.toString());
        }
    }
}
