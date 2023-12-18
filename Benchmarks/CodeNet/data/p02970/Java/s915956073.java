import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      double num = (int) n/(2*d+1);
      double num1 = n/(2*d+1);
      if(num == num1){
      	System.out.println(num);
      }
      else{
      	System.out.println(num+1);
      }
    }
}
