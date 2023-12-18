import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    String Burger = makeBurger(N);
    long sum = 0;
    for(int i = 0;i < X;i++){
      if(Long.parseLong(Burger.substring(i,i + 1)) == 1){
        sum++;
      }
    }
    System.out.println(sum);
  }




  public static String makeBurger(int N){
    if(N == 0){
      return "1";
    }
    String preBurger = makeBurger(N - 1);
    return "0" + preBurger + "1" + preBurger + "0"; 
  }
}
