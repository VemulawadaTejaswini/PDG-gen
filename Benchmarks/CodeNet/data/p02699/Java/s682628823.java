import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int S = scan.nextInt();
                int W = scan.nextInt();
                
                if(S<=W){
                    System.out.println("unsafe");
                }
                else{
                    System.out.println("safe");
                }
	}
}