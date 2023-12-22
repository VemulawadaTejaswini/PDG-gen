
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int result = 0;
		
		int n = scan.nextInt();
		int[] ary = new int[n];
		
		for(int i=0;i<n;i++) {
			ary[i] = scan.nextInt();
		}
		
		for(int a:ary) {
			
			for(int b:ary) {
				if(a%b == 0) {
					num++;
					if(num >=2) {
						break;
					}
				}
			}
			
			if(num < 2) {
				result++;
			}
			num=0;
				
		}
		
		System.out.println(result);
	}

}
