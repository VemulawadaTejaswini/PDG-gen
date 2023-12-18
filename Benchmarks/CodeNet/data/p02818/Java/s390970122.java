import java.util.*;
public class Main {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
      for(long i=0; i<k; i++){
        if(a>=1){
          a = a-1;
        }else if(a<=0 && b>=1){
          b=b-1;
        }else if(a<=0 && b<=0){
        }
      }
        System.out.println(a+" "+b);  
    }
}