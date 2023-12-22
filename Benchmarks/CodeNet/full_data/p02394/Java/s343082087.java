import java.util.Scanner;

class Main{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    int W = scan.nextInt();
    int H = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int r = scan.nextInt();

    if((x+r) <= W && (y+r) <= H && 0 <= (x+r) && 0 <= (y+r)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}