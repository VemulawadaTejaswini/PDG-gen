import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArray = convertInt(br.readLine().split(" "));
		int result = 0;
		for (int i = intArray[0]; i <= intArray[1]; i++) {
			if (intArray[2] % i == 0) { result++; }
		}
		System.out.println(result);
	}

	private static int[] convertInt(String[] strArray) {
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}