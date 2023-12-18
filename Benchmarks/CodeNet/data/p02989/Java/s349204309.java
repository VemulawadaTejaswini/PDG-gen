import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		List<Integer> argment = new ArrayList<>();

		for(int i = 0;i < length;i++) {
			argment.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(argment);

		int cnt = 0;
		for(int i = argment.get(0);i <argment.get(length - 1);i++) {
			int arc = 0,abc = 0;

			for(int x : argment) {
				if(x >= i) {
					arc++;
				}else {
					abc++;
				}
			}

			cnt += (arc == abc) ? 1 : 0;
		}

		System.out.println(cnt);
	}
}
