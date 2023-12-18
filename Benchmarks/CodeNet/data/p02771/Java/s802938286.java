
    
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a==b && c!=a)
            System.out.println("yes");
        else if(c==b && a!=c)
            System.out.println("yes");
        else if(a==c && b!=a)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}