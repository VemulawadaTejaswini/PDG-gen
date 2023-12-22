import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\s");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x;
        int y;
        int z;
        if(a>b){
        x = a;
        a = b;
        b = x;
        }
        if (b>c){
            y = b;
            b = c;
            c = y;
        }
        if (a>b){
            z = a;
            a = b;
            b = z;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
