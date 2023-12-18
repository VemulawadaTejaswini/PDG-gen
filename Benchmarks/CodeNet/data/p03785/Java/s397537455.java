public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int tempT = 0;
		int tempC = 0;
		int tempB = 0;
		int Ti = 0;
		while (scan.hasNext()) {
			Ti = scan.nextInt();
			if (tempC < C && Ti < tempT){
				tempC++;
			} else {
				tempB++;
				tempC = 1;
				tempT = Ti + K;
			}
		}
		System.out.println(tempB);
	}
}
