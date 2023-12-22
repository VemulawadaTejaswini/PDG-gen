import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] list = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 };
		Scanner scanner = new Scanner(System.in);// ??\?????????????????????
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			int num = scanner.nextInt();
			for(int j = 0; j < list.length; j++){
				if(num % list[j] == 0){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}