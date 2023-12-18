import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      for(int i = 0;i < n;i++){
      	for(int j = 0;j < n;j++){
        	if(n == 4*i+7*j)count++;
        }
      }
      if(count > 0)System.out.println("Yes");
      else System.out.println("No");
    }
}