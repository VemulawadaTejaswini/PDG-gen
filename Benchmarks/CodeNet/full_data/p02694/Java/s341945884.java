import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double N = sc.nextInt();
    double price = 100;
    int year = 0;
    while(price>=N){
      price += Math.floor(price*0.01);
      year++;
    }
    System.out.print(year);
  }
}
