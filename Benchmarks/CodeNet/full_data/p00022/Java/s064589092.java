import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int length = Integer.parseInt(input.nextLine());
		while(length != 0){
			max(length);
			length = Integer.parseInt(input.nextLine());
		}
		System.exit(0);
	}

	public static void max(int length){
		int sum = 0;
		for(int i = 0;i < length;i++){
			Scanner input = new Scanner(System.in);
			int num = Integer.parseInt(input.nextLine());
			sum += num;
		}
		System.out.println(sum);
	}

}