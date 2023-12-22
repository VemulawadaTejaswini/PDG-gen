import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            if(b.equals("?")) break;
            else if(b.equals("+")) System.out.println(a+c);
            else if(b.equals("-")) System.out.println(a-c);
            else if(b.equals("*")) System.out.println(a*c);
            else if(b.equals("/")) System.out.println(a/c);
        }
    }
}
