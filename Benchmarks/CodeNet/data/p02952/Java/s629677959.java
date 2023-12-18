import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		int n = sc.nextInt();
		int count=0;
		//int[] array = new int[n];

		/*for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}*/
		for(int i=1;i<=n;i++) {
			if(String.valueOf(i).length() %2!=0)count++;
		}
		System.out.println(count);
	}


	public static int sample() {
		return 1;
	}

}
