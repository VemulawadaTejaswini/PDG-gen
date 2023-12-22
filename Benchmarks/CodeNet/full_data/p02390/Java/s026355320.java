import java.util.Scanner;

class Main{

  public static void main(String[] args){
  
  Scanner scan = new Scanner(System.in);
  
  int sec = scan.nextInt();
  
  int hour = sec / 60;
  int min = hour / 60;
  int sec = min % 60;
  
  System.out.println(hour + ":" + min + ":" + sec);
  }
}