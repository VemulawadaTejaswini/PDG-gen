import java.util.Scanner;
class Main{
public static void main(String[] agrs){
Scanner scan=new Scanner(System.in);
String str=scan.next();
int times=Integer.parseInt(str);
int a=times/3600;
times=times%3600;
int b=times/60;
times=times%60;
int c=times;
System.out.println(a+":"+b+":"+c);
}
}