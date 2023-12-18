

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = ((n % 1000) % 100) / 10;
		int d = (((n % 1000) % 100) % 10);
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		array[a]++;
		array[b]++;
		array[c]++;
		array[d]++;
		for(int x:array){
			if(x >= 3){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
