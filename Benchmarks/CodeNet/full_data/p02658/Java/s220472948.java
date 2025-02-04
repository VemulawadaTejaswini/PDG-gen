import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      double max = Math.pow(10,18);
      long total = 1;
      for(int i = 0; i < n; i++){
        long a = sc.nextLong();
        if(Math.log10(a) + Math.log10(total) > 18 || a * total > 1000000000000000000L){
          total = -1;
        }else if(a == 0){
          total = 0;
        }else if(a != 1){
          total *= a;
        }
      }
      System.out.print(total);
    }
}
