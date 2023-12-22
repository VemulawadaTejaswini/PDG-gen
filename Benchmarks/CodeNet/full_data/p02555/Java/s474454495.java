import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 配列の長さ
        int s = sc.nextInt();
      	int max=s/3;//最大の長さ
      	double result=0;
      	long a=1;
      	long b=1;
      	long c=1;
      
		for(int i=1;i<=max;i++){//配列の長さi
          result+=com(s-3*i+(i-1),i-1);
          
          while(result>=1e9+7){
          	result%=1e9+7;
          }
          //System.out.println(result);
          Math.round(result);
        }
      
      	System.out.println((long)result);
    }
      	

	public static long com(int n, int r){
      double num = 1;
      for(int i = 1; i <= r; i++){
        num = (num * (n - i + 1) / i);
      }
      while(num>=1e9+7){
        num%=1e9+7;
      }
      return (long)num;
    }
    
  
  	
}
    

