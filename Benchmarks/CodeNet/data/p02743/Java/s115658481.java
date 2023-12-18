import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long m=4*a*b;
        long n=c*c+a*a+b*b+2*a*b-2*a*c-2*c*b;
        if(m<n)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}