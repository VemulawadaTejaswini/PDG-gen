import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int time[] = new int[3];
		time[0] = p + q;
		time[1] = r + q;
		time[2] = p + r;

		for(int i=0; i<time.length-1; i++) {
			if(time[i]>time[i+1]) {
				int tmp = time[i];
				time[i] = time[i+1];
				time[i+1]= tmp;
			}
		}

		System.out.println(time[0]);
	}
}
