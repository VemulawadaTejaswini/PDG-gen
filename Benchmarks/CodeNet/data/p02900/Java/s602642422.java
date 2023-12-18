import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
    
	  if(a < b){
      	long c = a;
        a = b;
        b = c;
      }
      //最大公約数を求める
      while(a > 0 && b > 0){
        if(a < b){
      	long c = a;
        a = b;
        b = c;
      	}
      	a = a % b;
      }
      long gcd = a > b ? a : b;/*最大公約数*/
      Set<Integer> set = new HashSet<Integer>();      
      for(int i = 2; i <= gcd; i++){
       while(gcd % i == 0){
         gcd /= i;
         set.add(i);
       }
     }

	System.out.println(set.size()+1);
    }
}