import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = Integer.valueOf(sc.nextInt());
		int W = Integer.valueOf(sc.nextInt());
		if(S > W) {
			System.out.println("safe");
		}else {
			System.out.println("unsafe");
		}
		
	}
}