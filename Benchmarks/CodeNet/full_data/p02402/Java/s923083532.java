import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int length = sc.nextInt();
			int min = 9999999, max = -9999999;
			long sum = 0;
			for(int i = 0 ; i < length ; i++) {
				int num = sc.nextInt();
				min = num<min?num:min;
				max = num>max?num:max;
				sum += num;
			}
			System.out.println(String.format("%d %d %d", min, max, sum));
		}
	}
}
