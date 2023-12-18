import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
	int[] number = new int[str.length()];
    int n = 0;
    
    for(int i = 0; i < str.length();i++){
      number[i] = Integer.parseInt(""+str.charAt(i));
      n =+ number[i];
    }
    
    if((Integer.parseInt(str) % n) == 0){
     System.out.println("Yes"); 
    }
    else{
     System.out.println("No");
    }
    scanner.close();
  }
}