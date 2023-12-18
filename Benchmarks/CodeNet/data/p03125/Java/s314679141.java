import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.next();
    int B = scanner.next();
    int output = 0;
    if((B % A) == 0){
    	output = A + B;
    }
    else{
      output = B - A;
    }
    System.out.println(output);
  }
}