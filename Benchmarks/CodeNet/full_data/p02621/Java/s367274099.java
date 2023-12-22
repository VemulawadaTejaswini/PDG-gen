import java.util.Scanner;
class SUM
{
  public static void main(String[] args)
  {
    Scanner me=new Scanner(System.in);
    int sum,sq,cube;
    int n;
    n=me.nextInt();
    sq=n*n;
    cube=n*n*n;
    sum=n+sq+cube;
    System.out.println(sum);
  }
}