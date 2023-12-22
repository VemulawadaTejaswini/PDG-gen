import java.util.Scanner;

public class Main{
public static void main (String []args){
Scanner stdin = new Scanner (System.in);
int num1 = stdin.nextInt();
int num2 = stdin.nextInt();
int num3 = stdin.nextInt();
if(num1 <= num2 && num2 <= num3){
System.out.println("YES");
}else if(num1 >= num2 && num2 >= num3){
System.out.println("NO");
}
}
}