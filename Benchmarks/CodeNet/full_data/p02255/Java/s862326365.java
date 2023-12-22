import java.util.Scanner;

public class Main {
	static int[] insertSort(int[] x) {
		int v,j;
		for(int i = 0;i < x.length;i++) {
			v = x[i];
			j = i - 1;
			while(j >= 0 && x[j] > v) {
				x[j + 1] = x[j];
				j--;
			}
			x[j + 1] = v;
			show(x);
		}
		return x;
	}
	static void show(int[] x) {
		for(int i = 0;i < x.length;i++) {
			System.out.print(x[i]);
			if(i + 1 != x.length) System.out.print(" ");
			else System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int[] x = new int[a];
		for(int i = 0;i < a;i++) {
			x[i] = number.nextInt();
		}
		insertSort(x);
	}
}

