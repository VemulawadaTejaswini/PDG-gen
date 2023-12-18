import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());

		int i = 0;
		int temp = 0;
		while(true) {
			i++;
			int base = X- (temp+i);
			if(base == i+1) {
				System.out.println(i+1);
				break;
			}else if(base > i+1) {
				temp += i;
			}else if(base < i+1) {
				System.out.println(X-temp);
				break;
			}
		}
	}

}
