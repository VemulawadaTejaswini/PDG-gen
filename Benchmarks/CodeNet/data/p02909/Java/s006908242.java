import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    String weather=scanner.nextInt();
    if(weather=="Sunny"){
      System.out.println("Cloudy");
    }else if(weather=="Cloudy"){
      System.out.println("Rainy");
    }else if(weather=="Rainy"){
      System.out.println("Sunny");
    }
  }
}