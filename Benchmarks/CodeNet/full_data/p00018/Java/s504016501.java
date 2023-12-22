import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);

		 int[] box = new int[5];
		 for(int i = 0;i < 5;i++){
			 box[i] = scan.nextInt();
		 }
		 Arrays.sort(box);
		for(int i = 0;i<5;i++){
			System.out.print(box[i]+ " ");
		}
		System.out.println();
	}
}