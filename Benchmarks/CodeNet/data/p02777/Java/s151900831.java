import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
	  String S = scan.next();
      String T = scan.next();
      int A = scan.nextInt();
      int B = scan.nextInt();
      String U = scan.next();
      
      if(U=S){
        A = A-1;
      }else if(U=T){
        B = B-1;
      }
      
      System.out.println(A+" "+B);
      
    }
}