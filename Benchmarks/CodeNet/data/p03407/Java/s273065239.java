import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,yn;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        yn= c-(a+b);
        if(yn<=0) System.out.println("Yes");
        else System.out.println("No");
    }
}