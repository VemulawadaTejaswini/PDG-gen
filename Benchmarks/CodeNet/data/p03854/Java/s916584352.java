import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final String S  = scanner.next();
        String T = "";
        boolean match = extend(T, S);
        if(match){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean extend(String t, String s){
        if(t.length() >= s.length()){
            return false;
        }
        else if(s.equals(t + "dream") || s.equals(t + "dreamer")||s.equals(t + "erase")||s.equals(t + "eraser")){
            return true;
        }
        else{
            boolean a = extend(t + "dream", s);
            boolean b = extend(t + "dreamer", s);
            boolean c = extend(t + "erase", s);
            boolean d = extend(t + "eraser", s);
            return (a || b || c || d);
        }
    }
}