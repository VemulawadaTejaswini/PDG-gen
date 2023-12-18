import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        System.out.println(isPal(s) && isPal(s.substring(0, (n - 1) / 2)) && isPal(s.substring((n + 3) / 2 - 1)) ? "Yes" : "No");
        scan.close();
    }
    
    public static boolean isPal(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
