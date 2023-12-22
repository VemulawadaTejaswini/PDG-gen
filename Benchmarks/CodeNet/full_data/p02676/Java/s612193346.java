import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        String S =sc.next();
        if(S.length()<=N) System.out.println(S);
        else System.out.println(S.substring(0,N)+"...");
    }
}