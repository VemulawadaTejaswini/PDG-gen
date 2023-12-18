import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long n=(c-a)*(c-a)+b*(b-2*a-2*c);
        if(n>0||c<=a+b)
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}