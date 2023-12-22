package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static void init(int[] arr, int[] init) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = init[i];
		}
	}
	public static int insertionSort(int[] arr, int n, int g) {
		int count = 0;
		for(int i = g; i < n; i++) {
			int key = arr[i];
			int j = i - g;
			while(j >= 0 && arr[j] > key) {
				arr[j + g] = arr[j];
				j -= g;
				count++;
			}
			arr[j + g] = key;
		}
		return count;
	}
	public static int shellSort(int[] arr, int n, List<Integer> list) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			count += insertionSort(arr, n, list.get(i));
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] init = new int[n];
		int count = 0;
		List<Integer> g = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			init[i] = sc.nextInt();
			arr[i] = init[i];
		}
		g.add(1);
		int index = 4;
		do {
			g.add(0, index);
			index = index * 3 + 1;
		} while (index <= n / 9);
		while (true) {
			count = shellSort(arr, n, g);
			if(count < Math.ceil(Math.pow(n, 1.5))) {
				break;
			} else {
				init(arr, init);
				count = 0;
				index = 3 * index + 1;
				g.add(0, index);
			}
		}
		System.out.println(g.size());
		for(int i = 0; i < g.size(); i++) {
			if(i == g.size() - 1) {
				System.out.println(g.get(i));
			} else {
				System.out.print(g.get(i) + " ");
			}
		}
		System.out.println(count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}

