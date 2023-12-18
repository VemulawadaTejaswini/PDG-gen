import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    if(util(s))
    System.out.println("YES");
    else
    System.out.println("NO");

        
    }
    static boolean util(String s){
        if(s.length()<6)
        return false;
        
        if(s.charAt(2)!=s.charAt(3) ||s.charAt(4)!=s.charAt(5))
        return false;
        else
        return true;
    }
}