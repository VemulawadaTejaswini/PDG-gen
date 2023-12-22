import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        System.out.println(calc(n));
    }
    
    private static String calc(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1;i <= n;i++) {
            if ( isDiv(i) || isContain(i) ) {
                sb.append(i).append(" ");
            }
        }
        return sb.substring(0, sb.length()-1);
    }
    
    private static boolean isDiv(int n) { return n%3==0; }
    private static boolean isContain(int n) { return n%10==3; }
}