import java.util.*;
class Main{
  public static void main(int args[]){
    int coinVal=0;
    int coinVal2=0;
    int total=0;
    int toyPrice=0;
    Scanner scanner = new Scanner(System.in);
    coinVal = scanner.nextInt();
    coinVal = scanner.nextInt();
    toyPrice = scanner.nextInt();
    total = coinVal+coinVal2;
    if(total >= toyPrice){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}
