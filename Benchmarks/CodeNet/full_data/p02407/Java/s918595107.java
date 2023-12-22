import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int n = scanner.nextInt();
			int loopCnt = 0;
			List<Integer> list = new ArrayList<>();
			while(loopCnt < n){
				list.add(scanner.nextInt());
				loopCnt++;
			}
			Collections.reverse(list);
			for(int i:list){
				System.out.print(i+" ");
			}
		}
	}
}