import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        int b=(int)(Math.pow(a,2)+Math.pow(a,3)+a);
            System.out.println(b);
    }
}