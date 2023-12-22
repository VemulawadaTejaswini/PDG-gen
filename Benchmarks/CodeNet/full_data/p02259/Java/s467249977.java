package bubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		(new Main()).doit(br);
	}

	private void doit(BufferedReader br) throws NumberFormatException,
			IOException {
		int[] arr = new int[Integer.parseInt(br.readLine())];
		String[] strArr = br.readLine().split(" ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(strArr[i]);
		System.out.println(sort(arr));
		return;
	}

	private int sort(int[] arr) {
		int count = 0;
		int size = arr.length;
		boolean flag = true;
		int tmp;
//		System.out.println("[" + toString(arr) +"]");
		while (flag) {
			flag = false;
			for (int i = size - 1; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
//					System.out.println("[" + toString(arr) +"]");
					count++;
					flag = true;
				}
			}
		}
		return count;
	}

	private String toString(int[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < arr.length;i++){
			sb.append(arr[i]);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}