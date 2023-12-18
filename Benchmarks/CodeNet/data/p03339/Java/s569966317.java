public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		int[] atWestToEast = new int[N];
		int[] atEastToWest = new int[N];
		int count = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < N; i++) {
			if (S.charAt(i - 1) == 'W') {
				atWestToEast[i] = atWestToEast[i - 1] + 1;
			} else {
				atWestToEast[i] = atWestToEast[i - 1];
			}
			if (S.charAt(i) == 'E') {
				count++;
				atEastToWest[i] = atEastToWest[i - 1] - 1;
			} else {
				atEastToWest[i] = atEastToWest[i - 1];
			}
			 min = Math.min(min, atEastToWest[i] + atWestToEast[i]);
		}
		System.out.println(Math.min(0, min) + count);
	}

}