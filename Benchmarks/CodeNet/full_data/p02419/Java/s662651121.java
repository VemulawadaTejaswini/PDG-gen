import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        S=S.toLowerCase();
        int ans=0;
        while(true){
            String T=sc.next();
            if(T.equals("END_OF_TEXT")) break;
            T=T.toLowerCase();
            if(S.equals(T)) ans++;
        }
        System.out.println(ans);
    }
}
