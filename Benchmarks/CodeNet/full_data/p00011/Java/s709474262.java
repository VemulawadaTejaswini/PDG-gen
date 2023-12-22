import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] value = new int[w];
		for(int i = 0; i < w; i++){
			value[i] = i+1;
		}
		
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int num1 = Integer.valueOf(s.substring(0, 1));
//			System.out.println(num1);
			int num2 = Integer.valueOf(s.substring(2,3));
			int buffer = value[num1 - 1];
			value[num1 - 1] = value[num2 - 1];
			value[num2 - 1] = buffer;
		}
		
		for(int i = 0; i < w; i++){
			System.out.println(value[i]);
		}
	}
}