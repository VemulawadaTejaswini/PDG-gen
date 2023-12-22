import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        String S = sc.next();
        String T = sc.next();
        boolean a = false;
        if(S.equals(T.substring(0,S.length())))
            a = true;
        if(a) System.out.println("YES");
        else System.out.println("NO");
    }
}