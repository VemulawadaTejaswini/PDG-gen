import java.util.Scanner;

public class Main {

	private int[] in;
	private int size;
	public Main(int[] input) {
		this.in = input;
		this.size = input.length;
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			int parent = (i - 1) / 2;
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			System.out.printf("node %d: key = %d, ", i + 1, in[i]);
			if (parent >= 0 && parent < size && i != 0) {
				System.out.printf("parent key = %d, ", in[parent]);
			}
			if (left > 0 && left < size) {
				System.out.printf("left key = %d, ", in[left]);
			}
			if (right > 0 && right < size) {
				System.out.printf("right key = %d, ", in[right]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] inputs = new int[size];
		for(int i = 0; i < size; i++) {
			inputs[i] = in.nextInt();
		}
		Main test = new Main(inputs);
		test.print();
		
		in.close();
	}
}
