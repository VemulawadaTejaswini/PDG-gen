package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Integer height = Integer.parseInt(sc.next());
		Integer width  = Integer.parseInt(sc.next());

		List<List<Boolean>> board = new ArrayList<>();

		board.add(new ArrayList<>());
		for (int i = 0; i < height + 2; i++) {
			board.get(0).add(false);
		}

		for (int i = 0; i < height; i++) {
			board.add(new ArrayList<>());
			String s = sc.next();
			board.get(i + 1).add(false);

			for (int j = 0; j < width; j++) {
				board.get(i + 1).add(s.charAt(j) == '#');
			}

			board.get(i + 1).add(false);
		}

		board.add(new ArrayList<>());
		for (int i = 0; i < height + 2; i++) {
			board.get(0).add(false);
		}

		sc.close();


		int count = 0;
		List<List<Boolean>> nextboard = new ArrayList<>();
		for (int i = 0; i < height + 2; i++) {
			nextboard.add(new ArrayList<>());

			for (int j = 0; j < width + 2; j++) {
				nextboard.get(i).add(false);
			}
		}

		while (board.stream().anyMatch(s -> s.stream().anyMatch(t -> t))) {
			for (int i = 1; i < height + 1; i++) {
				for (int j = 1; j < width + 1; j++) {
					nextboard.get(i).set(j, board.get(i - 1).get(j)
										 || board.get(i + 1).get(j)
										 || board.get(i).get(j - 1)
										 ||	board.get(i).get(j + 1));
				}
			}

			for (int i = 1; i < height + 1; i++) {
				for (int j = 1; j < width + 1; j++) {
					board.get(i).set(j, nextboard.get(i).get(j));
				}
			}

			count++;
		}

		System.out.println(count);
	}
}
