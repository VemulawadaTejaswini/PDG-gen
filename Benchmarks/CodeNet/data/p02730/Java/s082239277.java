import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int opt = 0;
        boolean check = true;
        for(int i=0;i<S.length();i++){
         if(S.charAt(i)!=S.charAt(S.length()-i-1)){
             check = false;
             break;
         }
        }
        if(check)opt++;
        StringBuilder s = new StringBuilder(S.substring(0,(S.length()-2)/2));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check)opt++;
        s = new StringBuilder(S.substring((S.length()+2)/2));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check)opt++;
        if(opt==3) System.out.println("Yes");
        else System.out.println("No");
    }
}