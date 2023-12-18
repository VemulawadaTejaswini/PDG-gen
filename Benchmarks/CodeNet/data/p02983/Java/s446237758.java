import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long l = sc.nextLong();
    long r = sc.nextLong();
    
    long ans = 2019;
	for(long i=l; i<=r; i++){
      for(long j=i+1; j<=r; j++){
        long x = (i*j)%2019;
        if(ans > x){
          ans = x;
        }
      }
    }
    
    System.out.println(ans);
  }
}