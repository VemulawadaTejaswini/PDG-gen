import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		String nums = input.nextLine();
		String num1 = "";
		String num2 = "";
		boolean state = false;
		for(int i = 0; i < nums.length(); i++) {
			if(state){
				num2 += nums.substring(i, i+1);
			}
			if(nums.substring(i, i+1).equals(" ")) {
				state = true;
			}
			if(!state) {
				num1 += nums.substring(i, i+1);				
			}	
		}

		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);
		int gcd = 1;
		while(int1 >= int2) {
			int temp = int2;
			int2 = int1 % int2;
			if(int2 == 0) {
				gcd = temp;
				break;
			}
			int1 = temp;
			System.out.println(int1 + " " + int2);
		}
		System.out.print("\t" + gcd);
	}
}

