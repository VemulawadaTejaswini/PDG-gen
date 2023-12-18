import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = n / (a + b);
        int d = n % (a + b);
        if(d <= a){
            System.out.println(a * c + d);
        }else{
            System.out.println(a * (c + 1));
        }
    }
}