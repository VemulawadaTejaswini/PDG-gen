import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static boolean judge(int num){
		boolean result;
		if(0<num && num<=100){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}
	public static int power(int num){
		int pow = num*num*num;
		return pow;
	}
	public static void main(String[] args) throws IOException{

		//??£?¨???¨??\???
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if(judge(num) == true){
		 System.out.println(power(num));
		}
		else if(judge(num) == false){
			System.out.println("1~100??§??\?????????????????????.???????????????.");
		}

		}

	}