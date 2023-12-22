import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
      	Scanner scanner = new Scanner(System.in);
      	int k = scanner.nextInt();
        String s = scanner.next();
      
      if(s.length() < k){
      	System.out.println(s);
     }else{
        k = k - 1;
      	System.out.println(s.substring(0,k) + "...");
      }
    }
}