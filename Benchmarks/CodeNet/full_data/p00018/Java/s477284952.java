import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);

		List<Integer> box = new ArrayList<Integer>();
		 for(int i = 0;i < 5;i++){
			 int put = scan.nextInt();
			 box.add(put);
		 }
		 Collections.sort(box, Comparator.reverseOrder());
		for(int i = 0; i < 5;i++){
			int show = box.get(i);
			System.out.print(show + " ");
		}
		System.out.println();
	}
}