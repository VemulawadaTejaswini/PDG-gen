import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        long K = stdIn.nextLong();
        long I;
      
      if(a+b>=K){
        I=a;
      }
      else{
        I=2*a-K+b;
      }
      
      System.out.println(I);
   
      
 
			
		
 
	}
 
}
