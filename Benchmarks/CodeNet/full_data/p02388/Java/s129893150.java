
public class Main {

	public static int calc(int num){
		int ans = 1;
		for(int i=0;i<3;i++){
			ans = ans * num;
		}
		return ans;
	}

	public static void main(String[] args){
		int result;

		//System.out.print("You input any number  : ");
		int number = new java.util.Scanner(System.in).nextInt();
		//System.out.print("You input repeat times  : ");
		//double  repeat = new java.util.Scanner(System.in).nextInt();
		result = calc(number);
		System.out.println(result);
	}
}