import java.util.Scanner;
import java.io.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        while(true)){
            int a=sc.nextInt();
            b=sc.next();
            if(b.equals("?"))break;
            int c=sc.nextInt();
            if(b.equals("+"))System.out.println(a+c);
            if(b.equals("-"))System.out.println(a-c);
            if(b.equals("*"))System.out.println(,a*c);
            if(b.equals("/"))System.out.println(a/c);
        }
    }
}