import java.util.Scanner;
public class Main {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextint();
int b = scan.nextint();
if(a*b%2==0){
System.out.println("Yes");
        }else{
             System.out.println("No");}
scan.close();
}
}