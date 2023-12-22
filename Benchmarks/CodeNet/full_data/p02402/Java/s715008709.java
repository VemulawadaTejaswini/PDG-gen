import java.util.Scanner;
class Main {
	int max = -1000000,min = 1000000;
	public void min() {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int n = sc.nextInt();
		if(n == 0) {
			max = 0;
			min = 0;
		} else if (n == 1) {
			int ai = sc.nextInt();
			if(max < ai) {
				max = ai;
				min = 0;
				sum = ai;
			} else if (min > ai) {
				max = 0;
				min = ai;
				sum = ai;
			}
		} else {
			for(int I = 1; I <= n; I++) {
				int ai = sc.nextInt();
				if(max < ai) {
					max = ai;
				} else if( min > ai) {
					min = ai;
				}
				sum += ai;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
	public static void main(String[] args) {
		new Main().min();
	} 
}