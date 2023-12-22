import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String T = sc.next();
        String[] t = T.split("");
        
        long count = 0;
        for(int i=0; i<t.length; i++) {
            if(t[i].equals("?")) System.out.print("D");
            else System.out.print(t[i]);
        }
        
        
    }   
}
