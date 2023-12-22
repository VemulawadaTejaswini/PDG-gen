import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			solv(n);
		}
		
	}
	static void solv(int a) {
		int[] list = new int[a];
		list[0] = a;
		System.out.println(list[0]);
		while(true) {
			boolean C = true;
			for(int i = a-1; i >= 0; i--) {
				if(list[i] >= 2) {
					list[i]--;
					list[i+1]++;
					C = false;
					while(true) {
						boolean X = false;
						for(int j = a-1; j >= 1; j--) {
							if(list[j] > list[j-1]) {
								list[j]--;
								list[j+1]++;
								X = true;
							}
						}
						if(!X) break;
					}
					break;
				}
			}
			if(C) break;
			System.out.print(list[0]);
			for(int i = 1; i < a; i++) {
				if(list[i] == 0) break;
				System.out.print(" " + list[i]);
			}
			System.out.println();
			
		}
	}
}