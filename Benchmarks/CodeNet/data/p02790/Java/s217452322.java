import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        int min=(a<b)?a:b;
        for(int i=0;i<max;i++)
            System.out.print(min);
    }
}
