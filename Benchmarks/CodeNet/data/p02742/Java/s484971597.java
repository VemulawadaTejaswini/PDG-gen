import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextInt();
    long w = sc.nextInt();

    if(h==1 || w==1) {
      System.out.println(1);
      System.exit(0);
    }

    long ans;
    if(h*w % 2 == 0) ans = h*w/2;
    else             ans = h*w/2+1;

    System.out.println(ans);
  }
}