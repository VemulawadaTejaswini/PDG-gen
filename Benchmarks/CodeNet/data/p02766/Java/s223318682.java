import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	
    Scanner scan = new Scanner(System.in);
    
    String n = scan.next();
    int k = scan.nextInt();
    
    String res = Integer.toString(Integer.parseInt(n, k));
      
    System.out.println(res.length());
 
  }
}