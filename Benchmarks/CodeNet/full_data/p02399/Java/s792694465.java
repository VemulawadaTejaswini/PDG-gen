import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	int a = sc.nextInt();
	int b = sc.nextInt();
        int d = a / b;
	int r = a % b;
	float x = a;
	float y = b;
	float f = x / y;


	System.out.println(d + " " + r + " " + f);
  }
	


}