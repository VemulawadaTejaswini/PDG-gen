import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		BigDecimal max = new BigDecimal("1000000");
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int[] a = new int[4001];
			boolean f = true;
			
			for(int i = 0; i < n; i++){
				int s = sc.nextInt();
				BigDecimal bd1 = new BigDecimal(sc.next());
				BigDecimal bd2 = new BigDecimal(sc.next());
				
				if(a[s] == 1){
					continue;
				}
				a[s] = 1;
				bd1 = bd1.multiply(bd2);
				
				if(bd1.compareTo(max) != -1){
					System.out.println(Integer.toString(s));
					f = false;
				}
			}
			if(f){
				System.out.println("NA");
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}