import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    
   long s = sc.nextLong();
    long ans=0;
    ans +=s/500*1000;
    s%=500;
    ans+=s/5*5;
    System.out.println(ans);

        
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