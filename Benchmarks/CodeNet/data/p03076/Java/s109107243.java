import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int d=scan.nextInt();
    int e=scan.nextInt();
    a=(int)Math.ceil(a/10);
    b=(int)Math.ceil(b/10);
    c=(int)Math.ceil(c/10);
    d=(int)Math.ceil(d/10);
    e=(int)Math.ceil(e/10);
    int s=min(a%10,b%10);
    s=min(s,c%10);
    s=min(s,d%10);
    s=min(s,e%10);
    s+=10*(a+b+c+d+e)-10;
    System.out.println(s);
  }
}
