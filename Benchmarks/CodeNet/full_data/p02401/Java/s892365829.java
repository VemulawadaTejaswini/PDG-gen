import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do{
        String line1 = scanner.next();
        String line2 = scanner.next();
        String line3 = scanner.next();

        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line3);

        if(line2.equals("+")){
            System.out.println(a+b);
        }else if(line2.equals("-")){
            System.out.println(a-b);
        }else if(line2.equals("*")){
            System.out.println(a*b);
        }else if(line2.equals("/")){
            System.out.println(a/b);
        }else if(line2.equals("?")){
            break;
        }
        }while(true);
    }
}
