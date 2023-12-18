import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int res=n>1?Math.pow(n,3):1;
    System.out.println(res);
  }
}