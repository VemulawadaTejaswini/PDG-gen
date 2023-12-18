import java.util.Scanner;
 
public class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  String str = scan.nextLine();
   
  switch(str){
    case "Sunny":
      System.out.println("Cloudy");
    case "Cloudy":
      System.out.println("Rainy");
    case "Rainy":
      System.out.println("Sunny");
  }
 }
  
}