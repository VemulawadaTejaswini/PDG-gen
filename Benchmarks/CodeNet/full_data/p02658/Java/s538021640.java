import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      double max = Math.pow(10,18);
      long total = 1;
      long a = 0;
      for(int i = 0; i < n; i++){
        a = sc.nextLong();
        total = total * a;
	}
      if(total < max){
        System.out.print(total);
      }else{
        System.out.print("-1");
      }
    }
}
