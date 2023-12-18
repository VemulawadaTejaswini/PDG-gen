import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int so=n/(a+b);
        if(a==0){
            System.out.println('0');
            System.exit(0);
        }else if(n%(a+b)<=a){
            System.out.println(a*so + n%(a+b));
            System.exit(0);
        }else{
            System.out.print(a*so+a);
        }
    }
}