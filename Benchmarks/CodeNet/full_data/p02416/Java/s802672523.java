import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long sum = 0;

		while(true){
			sum = 0;
			String str = scan.nextLine();
			long su = Long.parseLong(str);

			if(su == 0){
				break;
			}
			if(su <= Math.pow(10, 1000)){
				for(int i = 0; i < str.length(); i++){
					sum += Integer.parseInt(String.valueOf(str.charAt(i)));
				}
			}
			System.out.println(sum);
		}
	}
}