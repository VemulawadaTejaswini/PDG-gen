import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int tmp;

        tmp = a;
        a = b;
        b = tmp;

        tmp = a;
        a = c;
        c = tmp;
        
        System.out.println(a + " " + b + " " + c);
    }
}