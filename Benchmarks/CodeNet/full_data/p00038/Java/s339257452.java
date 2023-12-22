import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static long[] list = new long[10001];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int[] data = new int[5];
			String[] tmp = stdIn.next().split(",");
			for(int i = 0; i < 5; i++) {
				
				data[i] = Integer.parseInt(tmp[i]);
			}
			solv(data);
		}
	}
	public static void solv(int[] a) {
		Arrays.sort(a);
		if((a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) || (a[1] == a[2] && a[2] == a[3] && a[3] == a[4])) {
			System.out.println("four card");
			return;
		}
		if((a[0] == a[1] && a[1] == a[2] && a[3] == a[4]) || (a[0] == a[1] && a[2] == a[3] && a[3] == a[4])) {
			System.out.println("full house");
			return;
		}
		if((a[0] == 1 && a[1] == 2 && a[2] == 3 && a[3] == 4 && a[4] == 5) || a[0] == 1 && a[1] == 10 && a[2] == 11 && a[3] == 12 && a[4] == 13) {
			System.out.println("straight");
			return;
		}
		for(int i = 1; i < 5; i++) {
			if(a[i-1]+1 != a[i]) {
				break;
			}
			if(a[i] == 1) {
				break;
			}
			if(i == 4) {
				System.out.println("straight");
				return;
			}
		}
		for(int i = 2; i < 5; i++) {
			if(a[i-2] == a[i-1] && a[i-1] == a[i]) {
				System.out.println("three card");
				return;
			}
		}
		int count = 0;
		for(int i = 1; i < 5; i++) {
			if(a[i-1] == a[i]) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("two pair");
		}
		if(count == 1) {
			System.out.println("one pair");
		}
		if(count == 0) {
			System.out.println("null");
		}
		
	}
}