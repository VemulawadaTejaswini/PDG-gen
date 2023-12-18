import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();    
        int q = stdIn.nextInt();  
        String t = "";
        String copy;
        for (int qi = 0; qi < q; qi++) {
            int ty = stdIn.nextInt();  
            if (ty == 1) {
                copy = s.substring(0, s.length());
                s = t.substring(0, t.length());
                t = copy.substring(0, copy.length());
            } else {
                int f = stdIn.nextInt(); 
                String c = stdIn.next();
                if (f == 1) {
                    t += c; 
                } else {
                    s += c;
                }
            }
        }  
        stdIn.close();
        StringBuffer str = new StringBuffer(t);
        t = str.reverse().toString();
        System.out.println(t+s);        
    }
}