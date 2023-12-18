import java.util.Scanner;
public class Main {
public static void main(String[] args){
    int X,A,B,m;
    Scanner scan=new Scanner(System.in);
    X=scan.nextInt();
    A=scan.nextInt();
    B=scan.nextInt();
    m=(X-A)%B;
    if(A+B<=X){
     System.out.println(m);
    }
    else{
     System.out.print("input error!");
    }
   }}