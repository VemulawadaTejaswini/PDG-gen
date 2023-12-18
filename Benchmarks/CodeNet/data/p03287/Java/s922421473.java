import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n  = Integer.parseInt(temp[0]);
		long m = Long.parseLong(temp[1]);

		String[] tmp = scanner.nextLine().split(" ");
		long[] list = new long[n];
		for(int i =0; i < n ; i++) {
			list[i] = Long.parseLong(tmp[i]);
		}

		long count = 0;
		for(int i = 0; i < n - 1; i++) {

			long now = 0;
			for(int j = i; j < n; j++) {

				now += list[j];

				if(now % m == 0)count++;
			}


		}


		System.out.println(count);


	}
}
