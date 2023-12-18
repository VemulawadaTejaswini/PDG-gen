import java.util.*;

class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();
        
        String str = "";
        
        for(int i = 0; i < n; ++i) {
            str += s.charAt(i);
            str += t.charAt(i);
        }
        
        System.out.println(str);
    }
}