import java.util.Scanner;
public class Main{
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		thumbnail(scan);

	}

	public static void thumbnail(Scanner scan) {
		int N = scan.nextInt();
		int[] array = new int[N];
		double ave=0;
		for(int i=0;i<N;i++) {
			int mid = scan.nextInt();
			ave += mid;
			array[i] = mid;
		}
		ave /= (double)N;
		int resultIndex = 0;
		double min = Math.abs(array[0]-ave);
		for(int i=1;i<N || min==0;i++) {
			double mid = Math.abs(array[i]-ave);
			if(mid<min) {
				resultIndex = i;
				min = mid;
			}
		}
		System.out.println(resultIndex);
	}

}
