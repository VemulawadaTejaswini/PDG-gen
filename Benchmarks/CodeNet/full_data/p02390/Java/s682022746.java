import java.util.Scanner;

class AojTest{

  public static void main(String[] args){
  
  Scanner scan = new Scanner(System.in);
  
  int secAll = scan.nextInt();
  
  int hour = secAll / 3600;
  int min = secAll / 60 - hour * 60;
  int sec = secAll - ((hour * 3600) + (min * 60));
  
  System.out.println(hour + ":" + min + ":" + sec);
  }
}