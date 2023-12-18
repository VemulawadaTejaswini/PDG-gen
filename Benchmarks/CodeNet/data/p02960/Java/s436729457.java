import java.util.Scanner;

public class Main {
	
	static int num = 0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
        
		String[] array = s.split("");
		
		calc(array);
		
		System.out.println(num % (1000000000+7));
		
        sc.close();
	}
	
	static void calc(String[] array) {
		boolean flg = true;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals("?")) {
				String[] a = new String[array.length];
				
				for(int j = 0; j < array.length; j++) {
					a[j] = array[j];
				}
				for(int j = 0; j <= 9; j++) {
					
					a[i] = j + "";
					calc(a);
				}
				flg = false;
				break;
			}
		}
		
		if(flg) {
			int n = 0;
			for(int i = 0; i < array.length; i++) {
				n *= 10;
				n += Integer.parseInt(array[i]);
			}
			
			if(n % 13 == 5) {
				num++;
			}
		}
	}
}