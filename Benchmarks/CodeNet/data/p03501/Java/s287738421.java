import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = 0;
		int num = number;
		while(number > 0){
			   sum += number % 10;
			   number /= 10;
		}
		
		if(num % sum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}