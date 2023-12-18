import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        long all=0;
        all+=n/(a+b)*a;
        if(n%(a+b)>a)
            all+=a;
        else
            all+=n%(a+b);
        System.out.println(all);

    }
}



