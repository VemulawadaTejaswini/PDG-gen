import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cost = sc.nextInt();
    int money = sc.nextInt();
    int satisfaction = sc.nextInt();
    if(cost * satisfaction >= money){
      System.out.println(satisfaction);
    }else{
      System.out.println(money / cost);
    }
  }
}