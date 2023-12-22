import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
  long a=input.nextInt();
  long b=input.nextInt();
  long c=input.nextInt();
  long d=input.nextInt();
  long max=a*c>b*d?a*c:b*d;
  max=max>a*d?max:a*d;
  max=max>b*c?max:b*c;
    System.out.println(max);
}
}