import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(strength(s)&&strength(s.substring(0,s.length()/2))&&strength(s.substring((s.length()+1)/2,s.length()))){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
    private static boolean strength(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;

        }
        return true;
    }
}
