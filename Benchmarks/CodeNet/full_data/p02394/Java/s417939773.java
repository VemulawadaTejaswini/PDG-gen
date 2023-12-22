import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int W = scan.nextInt();
    int H = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    int r = scan.nextInt();
    if(inner(W, H, x, y, r)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
  static boolean inner(int w, int h, int x, int y, int r){
    if(x - r < 0){
      return false;
    }
    else if(x + r > w){
      return false;
    }
    else if(y - r < 0){
      return false;
    }
    else if(y + r > h){
      return false;
    }
    return true;
  }
}