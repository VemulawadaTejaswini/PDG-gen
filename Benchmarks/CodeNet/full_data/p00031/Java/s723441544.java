import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int[] result = weights(sc.nextInt());
			printArray(result);
		}
		sc.close();
	}
	
	static int[] weights(int weight) {
		int[] result = new int[10];
		int remain = weight;
		for(int i = 9; i >= 0; i--) {
			result[i] = remain/pow2(i);
			remain = remain - result[i] * pow2(i);
		}
		return result;
	}
	
	static int pow2(int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result *= 2;
		}
		return result;
	}
	
	static void printArray(int[] array) {
		int i;
		for(i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				System.out.print((array[i] * pow2(i)));
				i++;
				break;
			}
		}
		for(;i < array.length; i++) {
			if(array[i] != 0) {
				System.out.print(" " + (array[i] * pow2(i)));
			}
		}
		System.out.println();
	}
}