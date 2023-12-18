import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	
    Scanner scan = new Scanner(System.in);
    
    String n = scan.next();
    int k = scan.nextInt();
    
    String converted = (String)Integer.parseInt(n, k);
    
    System.out.println(converted.length());
    
  }
}