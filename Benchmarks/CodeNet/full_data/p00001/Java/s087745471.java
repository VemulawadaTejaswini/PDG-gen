public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	stdin   = new Scanner(System.in);
		int		arrIn[] = new int[10];

		for(int nLoop = 0; nLoop < arrIn.length; nLoop++) {
			arrIn[nLoop] = stdin.nextInt();
		}

		Arrays.sort(arrIn);

		for(int nLoop = 0; nLoop < 3; nLoop++) {
			System.out.println(arrIn[arrIn.length - nLoop - 1]);
		}
	}
}