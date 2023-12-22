import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int W = sc.nextInt();
		
		if(S>2*W){
			System.out.println("safe");
        }else{
			System.out.println("unsafe");
        }
    }
}
