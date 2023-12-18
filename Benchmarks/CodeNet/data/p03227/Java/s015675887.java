import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.length()==2){
            System.out.println(S);
        } else {
            System.out.println(S.charAt(2));
             System.out.println(S.charAt(1));
              System.out.println(S.charAt(0));
        }
    }
}