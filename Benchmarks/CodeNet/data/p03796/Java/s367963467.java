import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int power = 1;
		for(int i = 1;i <= N;i++){
			power = power*i;
		}
		//System.out.println(power);
		System.out.println(power/(10^9)+7);
	}

}
