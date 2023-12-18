import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String strN = sc.next();
        
        int max = 0;
        String ans = "";
        for(int i = 0; i < strN.length(); i++){
            int x = strN.charAt(i) - '0';
            max = Math.max(max, x);
        }
        
        System.out.println(Integer.toString(max) + max + max );
        
    }
}
