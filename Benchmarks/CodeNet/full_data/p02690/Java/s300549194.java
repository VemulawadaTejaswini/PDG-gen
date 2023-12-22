import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int x =  Integer.parseInt(sc.next());		
		long[] l = new long[101];
		for(int i = 0 ; i < 101 ; i++) {
			l[i] = multiplication(i);
		}
		
		boolean flag = false;
		int a = 0;
		int b = 0;
		for(int i = 0 ; i < 101 ; i++) {
			long temp = Math.abs(l[i] - x);
			for(int j = 0 ; j < 101 ; j++) {
				if(l[j] == temp) {
					flag = true;
					a = i;
					b = j;
					break;
				} 
				if(flag) {
					break;
				}
			}
			
			
		}
		
		
		long ans_a = multiplication(a);
		long ans_b = multiplication(b);
		
		if(ans_a + ans_b == x) {
			System.out.println(ans_a + " " + -b);
		}else if(ans_a - ans_b == x) {
			System.out.println(ans_a + " " + ans_b);
		}else{
			System.out.println(ans_b + " " + ans_a);
		}
	 }

	
	
	public static long multiplication(int i) {
		
		long temp = i * i;
		temp = temp * temp * i;
		return temp;
	}
	
}
