import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String s=input.next();
    String t=input.next();
    String temp=t.substring(0,t.length()-1);
    if(temp.equals(s)){
    System.out.print("Yes");
    }else System.out.print("No");
    }
}