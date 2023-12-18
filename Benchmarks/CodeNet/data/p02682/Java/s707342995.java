import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextInt();
        long b = stdIn.nextInt();
        long c = stdIn.nextInt();
        long K = stdIn.nextInt();
        long I;
      
      if(a+b>=K){
        I=a;
      }
      else{
        I=a-c;
      }
      
      System.out.println(I);
   
      

			
		
 
	}
 
}