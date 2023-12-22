import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
      
        long oni = T*V + A;
        long nige = T*W + B;
      
        if(oni >= nige){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
    
	}
}