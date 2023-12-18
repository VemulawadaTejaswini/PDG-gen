import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l = s.length();
        boolean ans = true;
        for(int i=0; i<l-1; i++){
            for(int j=i+1; j<l; j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(t.charAt(i)!=t.charAt(j)){
                        ans = false;
                    }
                }
            }
        }
        for(int i=0; i<l-1; i++){
            for(int j=i+1; j<l; j++){
                if(t.charAt(i)==t.charAt(j)){
                    if(s.charAt(i)!=s.charAt(j)){
                        ans = false;
                    }
                }
            }
        }

        System.out.println(ans?"Yes":"No");
    }
}