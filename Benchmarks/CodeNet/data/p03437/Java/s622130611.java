import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long y = sc.nextLong();
     for(long i = x;i <= (long)Math.pow(10,18),i+=x){
     	if(i%y!=0){
        	System.out.println(i);
          return;
        }
     }
      System.out.println(-1);
    }
}