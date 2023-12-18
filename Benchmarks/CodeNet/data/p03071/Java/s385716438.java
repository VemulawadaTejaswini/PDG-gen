
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> size = new ArrayList<Integer>();
		int coin = 0;
		for(int i =0;i<2;i++) {
			size.add(Integer.parseInt(sc.next()));
		}
		for(int j=0;j<2;j++) {
			int max = Collections.max(size);
			int min = Collections.min(size);
			coin = coin + max;
			max = max -1;
			size.clear();
			size.add(max);
			size.add(min);
		}
		System.out.println(coin);
	}

}
