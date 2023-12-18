import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
        long b = sc.nextLong();
      //int min=Math.min(a,b);
      int o=1;
      	for (long i=2;i<=Math.min(a,b);i++){
          if(a%i==0 && b%i==0){
            o++;
            while(a%i==0)a=a/i;
            while(b%i==0)b=b/i;
          }
        }
	   System.out.println(o);
	}
}