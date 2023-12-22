import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
while(true){
int a = scan.nextInt();
int b = scan.nextInt();
char op = new javautil.Scanner(System.in).nextChar();

if(op == '?'){break;}

if(op == '+'){System.out.println(a + b);}

if(op == '-'){System.out.println(a - b);}

if(op == '*'){System.out.println(a * b);}

if(op == '/'){System.out.println(a / b);}
}}}