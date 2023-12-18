import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String O = sc.next();
        String S = sc.next();
        for(int i = 0; i < S.length(); i++){
            System.out.print(O.charAt(i));
            System.out.print(S.charAt(i));
        }
        if(O.length() > S.length())
            System.out.println(O.charAt(O.length()-1));
    }
}