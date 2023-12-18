import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    if(S == "Sunny"){
      System.out.println("Cloudy");
    }else if(S == "Cloudy"){
      System.out.println("Rainy");
    }else if(S == "Rainy"){
      System.out.println("Sunny");
    }
  }
}
