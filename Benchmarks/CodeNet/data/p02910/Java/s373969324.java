import java.util.*;
import java.lang.*;



public class Main {
    static boolean isGoodDance(String dance){
        for(int i=0; i<dance.length(); i++){
            if(i%2==0 && dance.charAt(i)=='L') return false;
            if(i%2==1 && dance.charAt(i)=='R') return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dance = sc.next();
        System.out.println(isGoodDance(dance) ? "Yes" : "No");

    }
}
