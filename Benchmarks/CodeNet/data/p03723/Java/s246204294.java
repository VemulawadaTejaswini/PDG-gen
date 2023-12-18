import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long cnt = 0;
      while(a%2==0&&b%2==0&&c%2==0){
        if(a==b&&b==c){
      	  System.out.println(-1);
          return;
        }
      	a = (b+c)/2;
        b = (a+c)/2;
        c = (a+b)/2;
        cnt++;
      }
      System.out.println(cnt);
    }
}
