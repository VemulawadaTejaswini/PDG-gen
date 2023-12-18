import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = Math.max(a,b);
      if(sum == a){
      	sum = sum + Math.max(a-1,b);
      }
      else{
      	sum = sum + Math.max(a,b-1);
      }
      System.out.println(sum);
    }
}