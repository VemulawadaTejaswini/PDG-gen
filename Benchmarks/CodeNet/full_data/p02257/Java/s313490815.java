import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	static boolean[] isntPrime;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makePrimeList(100000000);
		int n = stdIn.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int x = stdIn.nextInt();
			if(x != 2 && x % 2 == 0) {
				continue;
			}
			if(!isntPrime[x]) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void makePrimeList(int n) {
		isntPrime = new boolean[n+1];
		isntPrime[0] = isntPrime[1] = true;
		for(int i = 3; i < n; i+=2) {
			if(!isntPrime[i]) {
				for(int j = i + i; j < n; j += i){
					isntPrime[j] = true;
				}
			}
		}
	}
}