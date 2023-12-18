import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long X = Long.parseLong(scan.nextLine());
		int year = 0;
		long deposit = 100;
		int head = 0;
		int tail = 3760;
		int center = 0;
		long checker = 0;

		for (int i = 0; i < 3760; i++){
			while (head <= tail){
				center = (head + tail) / 2;
				checker = (long) Math.floor(100 * Math.pow((1 + 0.01), center));
				if (checker == X){
					year = center;
					break;
				}else if (checker > X) {
					tail = center - 1;
				}else {
					head = center + 1;
				}
			}
		}
		System.out.println(year);
	}
}