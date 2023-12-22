import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.nextLine();
		String x = in.nextLine();
		String[] heap = x.split(" ");
		in.close();
		for(int i = 0; i < n; i++) {
			System.out.println(relationships(heap, i, n));
		}
	}
	
	public static String relationships(String[] heap, int i, int n) {
		String s = "node " + (i + 1) + ": key = " + heap[i] + ", ";
		int parent = (i - 1) / 2;
		int leftC = (2 * i) + 1;
		int rightC = (2 * i) + 2;
		if(parent >= 0 && parent < n && parent != i) {
			s = s.concat("parent key = " + heap[parent] + ", ");
		}
		if(leftC >= 0 && leftC < n) {
			s = s.concat("left key = " + heap[leftC] + ", ");
		}
		if(rightC >= 0 && rightC < n) {
			s = s.concat("right key = " + heap[rightC] + ", ");
		}
		return s;
	}
}
