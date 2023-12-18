import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int ans;

    int H = sc.nextInt();
    int W = sc.nextInt();

    int h = sc.nextInt();
    int w = sc.nextInt();

    ans = w*h + h*(W-w);

    System.out.println(ans);


  }

}
