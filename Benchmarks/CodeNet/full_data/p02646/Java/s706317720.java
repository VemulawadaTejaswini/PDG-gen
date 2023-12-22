import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong(); //鬼の座標
		
		long v = stdIn.nextLong(); //鬼の移動量
		
		long b = stdIn.nextLong(); //子供の座標
		
		long w = stdIn.nextLong(); //子供の移動量
		
		long t = stdIn.nextLong(); //時間
		
		if(v <= w) {
			System.out.println("NO");
		}else {
			
			long dist = Math.abs(b-a);
			
			long time = (dist+v-w-1)/(v-w);
			
			if(t < time) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
