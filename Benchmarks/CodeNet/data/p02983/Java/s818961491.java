import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      int min = 2018;
      
      if(r-l >= 2018) {
        System.out.println(0);
        return;
      }
      
      int num;
      for(long i = l; i < r; i++) {
        for(long j = l+1; j <=r; j++) {
          num = (int)(i*j)%2019;
          if(num<min) {
            min = num;
          }
        }
      }


      
      System.out.println(min);
	}
}