import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String a = stdIn.nextString();
    String s = Sunny;
    String c = Cloudy;
    String r = Rainy;
    if(a==s){
      System.out.println("Cloudy");
    }else if(a==c){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }
  }
}