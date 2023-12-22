import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Scanner kb=new Scanner(s);
        int a[]=new int[2];
        int i=0;
        String op="";
        while (kb.hasNext()){
            if (kb.hasNextInt()==false){
                op=kb.next();
            }
            a[i]=kb.nextInt();
            i++;
        }
        switch(op){
        case "+":
            System.out.println(a[0]+a[1]);
            break;
        case "-":
            System.out.println(a[0]-a[1]);
            break;
        case "*":
            System.out.println(a[0]*a[1]);
            break;
        case "/":
            System.out.println(a[0]/a[1]);
            break;
        }
    }
}