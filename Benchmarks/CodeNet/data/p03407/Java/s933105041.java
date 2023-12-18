import java.util.*;
class Main{
  public static void main(String args[]){
    int coinVal=0;
    int coinVal2=0;
    int total=0;
    int toyPrice=0;
    Scanner scanner = new Scanner(System.in);
    coinVal = scanner.nextInt();
    coinVal2 = scanner.nextInt();
    toyPrice = scanner.nextInt();
    total = coinVal+coinVal2;
    if(total >= toyPrice){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}