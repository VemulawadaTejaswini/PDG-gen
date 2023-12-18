import java.util.*;
class coins
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int X=obj.nextInt();
    int pts=(((X/500)*1000)+(((X-(500*(X/500)))/5)*5));
    System.out.println(pts);
  }
}
    