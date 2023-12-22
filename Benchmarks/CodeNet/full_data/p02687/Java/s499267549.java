import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s=="ABC"){
      System.out.print("ARC");
    } else if(s=="ARC"){
      System.out.print("ABC");
    }
  }
}