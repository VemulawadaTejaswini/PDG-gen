import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextInt();
        long b= sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextLong();
        if(a+c == b+c){
            System.out.println(0); return;
        }
        while(k-->0){
            long anew = b+c;
            long bn = a+c;
            long cn = a+b;
            a=anew;
            b =bn;
            c=cn;
        }
        System.out.println(a-b);
    }
}
