import java.util.Scanner;
 
public class SC{
    public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    String op = stdin.nextLine();
    int b = stdin.nextInt();
 
    while(!(op.equals("?"))){
         
        if(op.equals("*")){
        System.out.println(a*b);}
        else if(op.equals("+")){
        System.out.println(a+b);}
        else if(op.equals("/")){
        System.out.println(a/b);}
        else if(op.equals("-")){
        System.out.println(a-b);}
        a = stdin.nextInt();
        op = stdin.nextLine();
        b = stdin.nextInt();
    }
    }
}