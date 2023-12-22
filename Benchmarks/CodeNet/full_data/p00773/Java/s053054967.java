import java.util.*;
class Main {
  public static void main(String args[]){
    new Main().run();
  }

  Scanner sc = new Scanner(System.in);
  void run(){
    while(true){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int s = sc.nextInt();
      if((x|y|s)==0)break;

      int max = 0;
      for(int i = 1; i <= s-1; i ++){
        for(int j = 1; j <= s-1; j ++){
          if(tax(x,i) + tax(x,j) == s){
            max = Math.max(max, tax(y,i) + tax(y,j));
          }
        }
      }
      System.out.println(max);
    }
  }

  int tax(int x, int p){
    return p * (100 + x) / 100;
  }
}