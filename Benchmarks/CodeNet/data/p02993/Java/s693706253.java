import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();
      int c = sc.nextLong();
      int d = sc.nextLong();
      
      long cnt = 0;
      for(long i = 0; i < b-(a-1); i++) {
        if(((a+i)%c)!=0 && ((a+i)%d)!=0) {
          cnt++;
        }
      }
      System.out.println(cnt);
      
	}
}