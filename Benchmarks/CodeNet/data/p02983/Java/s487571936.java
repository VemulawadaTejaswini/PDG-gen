import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      long min = 2000000000;
      long num;
      int cnt = 0;
      for(long i = l; i < r; i++) {
        cnt++;
        for(long j = l+1; j <= r; j++) {
          num = ((i%2019)*(j%2019)%2019);
          if(num < min)
            min = num;
        }
        if(cnt == 2019)
          break;
      }
      System.out.println(min);
	}
}