import java.util.Scanner;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.print(Logic.run(x));
  }
}
class Logic{
  public static int run(int x){
    int res = 0;
    long money = 100;
    while ( money < x ){
      money*=1.01;
      res++;
    }
    return res;
  }
}