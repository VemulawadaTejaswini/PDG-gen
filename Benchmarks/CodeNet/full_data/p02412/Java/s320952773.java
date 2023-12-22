

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while(true){

			int num = in.nextInt();
			int sum = in.nextInt();
			int count = 0;

			if(num == 0 && sum == 0){

				break;

			}else{

				for(int f = 1; f <= (num-2); f++){

					for(int s = f; s <= (num-2); s++){

						for(int t = s; t <= (num-2); t++){

							// ??°????¢????
							// String c = f + "+" + (s + 1) + "+" + (t + 2);
							// System.out.println(c);

							if(f + (s + 1) + (t + 2) == sum){

								count++;

							}
						}
					}
				}

				list.add(count);

			}
		}

		for(int result: list){

			System.out.println(result);

		}

	}
}