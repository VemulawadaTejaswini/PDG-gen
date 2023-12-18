import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int val = 0;
		int[] color = new int[8];
		for(int i = 0; i < 8; i++) color[i] = 0;

		int N = Integer.parseInt(sc.next());

		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < N; i++){
			switch(a[i] / 400){
			case 0:
				color[0] = 1;
				break;
			case 1:
				color[1] = 1;
				break;
			case 2:
				color[2] = 1;
				break;
			case 3:
				color[3] = 1;
				break;
			case 4:
				color[4] = 1;
				break;
			case 5:
				color[5] = 1;
				break;
			case 6:
				color[6] = 1;
				break;
			case 7:
				color[7] = 1;
				break;
			default:
				val++;
				break;
			}
		}

		int total = 0;
		for(int i = 0; i < 8; i++){
			total += color[i];
		}

		System.out.println(total + " " + Math.min(total + val, 8));

	}

}