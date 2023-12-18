import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String fun(String a) {
        return new StringBuilder(a).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String a=sc.next();
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x==1)
                a=Main.fun(a);
            else{
                int p=sc.nextInt();
                String q=sc.next();
                if(p==1)
                    a=q+a;
                else
                    a+=q;
            }
        }
        System.out.println(a);


    }
}



