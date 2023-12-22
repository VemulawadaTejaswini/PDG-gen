import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[3];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());


		String buf ="";
		for(int i = 0; i < arr.length; i++){
			buf += arr[i];
			if(i != arr.length-1) buf += " ";
		}

		System.out.println(buf);

	}

}

