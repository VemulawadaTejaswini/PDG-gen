import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    boolean bl = false;
    int f = 0;
    int s = 0;
    for(int i = 0; i <= n; i++){
      for(int j = 0; j <= n - i; j++){
        if(i * 10000 + j * 5000 + (n - i - j) * 1000 == y){
          bl = true;
          f = i;
          s = j;
          break;
        }
      }
      if(bl){
        break;
      }
    }
    if(bl){
      System.out.println("" + f + " " + s + " " + (n - f - s));
    }else{
      System.out.println("-1 -1 -1");
    }
  }
}