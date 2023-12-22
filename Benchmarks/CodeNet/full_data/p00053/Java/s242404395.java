import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public static void main (String[] args) throws Exception {
		int[] list = sumList(prime());
		while(true) {
			String str = br.readLine();
			int n = Integer.parseInt(str);
			if(n == 0) break;
			System.out.println(list[n-1]);
		}
	}
	
	public static int[] prime() {
		int[] list = new int[10000];
		list[0] = 2;
		list[1] = 3;
		list[2] = 5;
		list[3] = 7;
		list[4] = 11;
		list[5] = 13;
		int pit = 6;
		for(int i=17; pit<10000; i = i+2) {
			for(int j=1; list[j]*list[j] < i; j++) {
				if(i%list[j] == 0) break;
				if(list[j+1]*list[j+1] > i) {
					list[pit] = i;
					pit++;
				}
			}
		}
		return list;
	}
	
	public static int[] sumList(int[] list) {
		int[] sums = new int[10000];
		sums[0] = 2;
		for(int i=1; i<10000; i++) {
			sums[i] = sums[i-1] + list[i];
		}
		return sums;
	}
}