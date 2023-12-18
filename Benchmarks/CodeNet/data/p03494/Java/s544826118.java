

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextLong());
		}
		boolean alleven = true;
		int halfcommand = 0;
		while(alleven) {
			if(list.stream().allMatch(number -> number % 2 == 0)) {
				halfcommand++;
				list.stream()
						.map(number -> number / 2)
						.collect(Collectors.toList());
			} else {
				alleven = false;
			}
			System.out.println(halfcommand);
		}
	}

}
