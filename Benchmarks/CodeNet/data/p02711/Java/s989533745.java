import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int b=a%10;
        int c=a/100;
        int d=a/10%10;
        if(b==7||c==7||d==7)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
