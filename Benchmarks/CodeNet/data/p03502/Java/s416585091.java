import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = scan.nextInt();
		String num = String.valueOf(number);
		int sum = 0;
		String[] strs = num.split("");
		for (int i = 1; i < strs.length; i++) {
			sum += Integer.parseInt(strs[i]);
			
		}
		if(number % sum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}