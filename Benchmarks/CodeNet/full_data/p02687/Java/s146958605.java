import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String con = "ABC";
    String input = sc.next();
    if(con.equals(input)){
      con = "ARC";
    }
    System.out.println(con);
    
    
  }
}