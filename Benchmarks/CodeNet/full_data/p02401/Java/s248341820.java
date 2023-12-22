import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        
        while (!(op.equals("?"))) {
            switch (op) {
                case "+" :
                    System.out.println(a+b);
                    break;
                case "-" :
                    System.out.println(a-b);
                    break;
                case "*" :
                    System.out.println(a*b);
                    break;
                case "/" :
                    System.out.println(a/b);
                    break;
            }
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
        }
    }
}