import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
 
     	long x = (B-A) % 2;
		long b = B-1;
     	long a = N-A;
      if(x==0){     
		long ans = A + (B-A)/2;
        System.out.println(ans);
      }else if(b>a){
     System.out.println(a);
      }else{
     System.out.println(b);
      }
      }
}
