import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String str = sc.next();
        
        int[] tmp = new int[3];
        tmp[0] = Integer.parseInt(String.valueOf(str.charAt(0)));
        tmp[1] = Integer.parseInt(String.valueOf(str.charAt(2)));
        tmp[2] = Integer.parseInt(String.valueOf(str.charAt(3)));
        
        long tmpa = a * tmp[0];
        long tmpb = a * tmp[1];
        long tmpc = a * tmp[2];
        
        long tmpb2 = tmpb / 10;
        long tmpc2 = tmpc / 100;
        
        long tmpb3 = (tmpb % 10) * 10;
        long tmpc3 = tmpc % 100;
        
        long tmpx = (tmpb3 + tmpc3) / 100;
        System.out.println(tmpa + tmpb2 + tmpc2 + tmpx);
    }
}
