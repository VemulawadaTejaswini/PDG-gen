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
      
      if(a>K){
        I=K;
      }
      else if(a+b>=K){
        I=a;
      }
      else{
        I=a-c;
      }
      
      System.out.println(I);
   
      
 
			
		
 
	}
 
}
