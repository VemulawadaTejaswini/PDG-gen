import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       
        Scanner scan = new Scanner(System.in);
        
        String N = scan.next();
        String A = scan.next();
        //String  = scan.next();
        
        //int  = Integer.parseInt(r) * 100 + Integer.parseInt(g) * 10 + Integer.parseInt(b);
        // N円500で割ったとき、あまりーA円＞0以下ならおｋ
        if((Integer.parseInt(N) % 500) - Integer.parseInt(A) <= 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
