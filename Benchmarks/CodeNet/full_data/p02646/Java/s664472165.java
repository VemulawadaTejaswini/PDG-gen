import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        
        long ab = B-A;
        long speed = Math.abs(W-V);
      
        if(ab <= speed*T){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
    
	}
}