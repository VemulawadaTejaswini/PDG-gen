import java.util.*;
 
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int X = sc.nextInt();
  	if(X == 3 || X == 7 || X==9){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}