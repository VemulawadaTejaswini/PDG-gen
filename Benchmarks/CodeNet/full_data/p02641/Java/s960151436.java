import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int X = Integer.parseInt(scanner.next());
		int N = Integer.parseInt(scanner.next());

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(scanner.next()));
		}
		int count = 1;
		while(true) {
			if(!list.contains(X-count)) {
				System.out.print(X-count);
				break;
			}else if(!list.contains(X+count)) {
				System.out.print(X+count);
				break;
			}
			count++;
		}

		scanner.close();
	}
}
