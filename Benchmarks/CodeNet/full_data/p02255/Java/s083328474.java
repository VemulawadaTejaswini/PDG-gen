

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int length = in.nextInt();
		int array[] = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
		}
		print(array);
		
		for (int i = 1; i < length; i++) {
			int key = array[i]; // this is the reference value
			int j = i - 1;
			
			while (j >=0 && array[j] > key) // go backwards
			{
				array[j+1] = array[j];
				j = j-1; // decrement j
			}
			array[j+1] = key;
			print(array);
		}
		
		in.close();
		
	}
	public static void print(int array[]) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.print("\n");
	}
}

