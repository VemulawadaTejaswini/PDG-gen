import java.util.Scanner;

class Main{
 public void main(String args[]){
  Scanner scan = new Scanner();
  String str = scan.Scanner(System.in);
   
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