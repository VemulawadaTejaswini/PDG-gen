import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int temp = 0;
		int[] point = new int[n+2];
		point[0] = 0;
		point[n+1] = 0;
		for (int i = 1; i < n+1; i++) {
			int a = sc.nextInt();
			point[i] = a;
			count += Math.abs(point[i] - point[i-1]);
		}
		count += Math.abs(point[n+1] - point[n]);
		
		for (int i = 1; i < n+1; i++) {
			temp = count;
			temp -= Math.abs(point[i] - point[i-1]) + Math.abs(point[i+1] - point[i]) - Math.abs(point[i+1] - point[i-1]);
			System.out.println(temp);
		}
	}
}