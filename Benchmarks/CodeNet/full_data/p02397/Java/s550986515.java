import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int a,b;
  Scanner sc = new Scanner(System.in);
  while (True){
  a=sc.nextInt();
  b=sc.nestInt();
  if(a==0 && b==0)
    break;
  else if(a<b)
    System.out.println(a +b);
  else
    System.out.println(b +a);}
 }
}
