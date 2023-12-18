import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A,B,C;
        int num=0;
        A=sc.next();
        B=sc.next();
        C=sc.next();
        if(A.charAt(A.length()-1)==B.charAt(0))  num++;
        if (B.charAt(B.length()-1)==C.charAt(0)) num++;
        if(num==2) System.out.println("Yes");
        else System.out.println("No");
    }
}