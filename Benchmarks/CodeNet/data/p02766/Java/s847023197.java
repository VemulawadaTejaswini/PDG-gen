import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	
    Scanner scan = new Scanner(System.in);
    
    String n = scan.next();
    int k = scan.nextInt();
    
    int converted = Integer.parseInt(n, k);
    String res = Integer.toString(converted);
      
    System.out.println(res.length());

  }
}