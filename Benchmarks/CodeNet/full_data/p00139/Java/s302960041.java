//package _0139;



import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	boolean isA(String snake) {

		if (snake.startsWith(">'")) {

			if (snake.endsWith("~")) {

				String mid = snake.substring(2, snake.length() - 1);

				if (mid.length() >= 3) {

					String[] spl = mid.split("#", 2);

					if (spl[0].equals(spl[1])) {

						for (int i = 0; i < spl[0].length(); i++) {

							if ('=' != spl[0].charAt(i)) {

								return false;

							}

						}

						return true;

					}

				}

			}

		}

		return false;

	}



	boolean isB(String snake) {

		if (snake.startsWith(">^")) {

			if (snake.endsWith("~~")) {

				String mid = snake.substring(2, snake.length() - 2);

				if (mid.length() >= 2) {

					while (mid.startsWith("Q=")) {

						mid = mid.substring(2);

					}

					if (mid.equals("")) {

						return true;

					}

				}

			}

		}

		return false;

	}



	/*

	 * >'======#======~ >^Q=Q=Q=Q=Q=Q=Q=Q=Q=~~

	 */

	String getAns(String snake) {

		String ret = "NA";

		if (snake.startsWith(">'")) {

			if (isA(snake))

				ret = "A";

		} else if (snake.startsWith(">^")) {

			if (isB(snake))

				ret = "B";

		}

		return ret;

	}



	void run() {

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println(getAns(sc.next()));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}