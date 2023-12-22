import java.util.Scanner;

class Main {
	private int n;
	private int[] A;
	private int[] B;
	private int k;

	public static void main(String[] args) {
		Main CS = new Main();
		CS.setA(CS.inputArray(CS.getA()));
		CS.setB(CS.coutingSort(CS.getA(), CS.getB(), CS.getK()));
		CS.displayArray(CS.getB());
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return A;
	}

	public void setA(int[] array) {
		A = array;
	}

	public int[] getB() {
		return B;
	}

	public void setB(int[] array) {
		this.B = array;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	private int[] inputArray(int[] array) {
		Scanner sc = new Scanner(System.in);

		setN(sc.nextInt());
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (getK() < array[i]) {
				setK(array[i]);
			}
		}

		return array;
	}

	public int[] coutingSort(int[] array, int[] sortedArray, int k) {
		int[] C = new int[k + 1];
		sortedArray = new int[array.length];

		for (int j = 0; j < sortedArray.length; j++) {
			C[array[j]]++;
		}

		for (int i = 1; i <= k; i++) {
			C[i] += C[i - 1];
		}

		for (int j = sortedArray.length - 1; j >= 0; j--) {
			sortedArray[C[array[j]] - 1] = array[j];
			C[array[j]]--;
		}

		return sortedArray;
	}

	public void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}