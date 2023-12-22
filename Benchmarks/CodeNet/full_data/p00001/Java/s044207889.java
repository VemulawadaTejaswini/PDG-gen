import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		int[] highs = new int[10];

		try {
			for(int i = 0; i <= 9; i++){
				highs[i] = Integer.parseInt(br.readLine());
			}

			for(int i = 0; i <=9;i++){
				list.add(highs[i]);
			}


			Collections.sort(list);
			Collections.reverse(list);


	        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}