import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a;
      int sum = 0;
      int count = 0;
      for(int i = 0;i<n;i++){
         a = sc.nextInt();
         sum += a;
         if(a>=sum/4/m){
            count++;
         }
      }      
      if(count>=m){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }      
	}
}