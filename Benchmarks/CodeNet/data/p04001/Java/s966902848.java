import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		int[] number = new int[s.length()];
		for(int i = 0; i < s.length(); i++)
			number[number.length-1-i] = s.charAt(i) - '0';
		
		dfs(number,0,0);
		System.out.println(sum);
	}
	
	static long sum = 0;
	
	static void dfs(int[] number, int digit, int i) {
		sum += Math.pow(2,number.length-i-1) * number[i] * Math.pow(10, digit);
		i += 1;
		if(i == number.length) return;
		
		dfs(number,digit+1,i);
		dfs(number,0,i);
		return;
	}
}
