import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			String s = String.valueOf(i);
			int total = 0;
			int num = i;
			while(num != 0){
				total += num % 10;
				num /= 10;
			}
			if(a <= total && total <= b){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
