
class Main{
	public static void main(String[] args) {
		int N, a, sum;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		sum = N % 10;
		for(int i = 100; i < 100000000; i = i * 10) {
			a = N % i - sum;
			if(a < 0) break;
			a = a / (i / 10);
			sum += a; 
		}
		if(N % sum == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
