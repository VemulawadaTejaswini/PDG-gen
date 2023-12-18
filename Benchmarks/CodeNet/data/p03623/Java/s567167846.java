package pb0530.q1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] strArray = line.split(" ");
		int[] array = new int[strArray.length];
		for(int i = 0; i < array.length; i++ ) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		int distanceA = Math.abs(array[0] - array[1]);
		int distanceB = Math.abs(array[0] - array[2]);
		if(distanceA < distanceB) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}
