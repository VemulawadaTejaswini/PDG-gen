import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] array=new int[n];
		double min=9999999;
		int res=0;

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			if(min>Math.abs(a-(t-array[i]*0.006))) {
				min=Math.abs(a-(t-array[i]*0.006));
				res=i+1;
			}
		}
		System.out.println(res);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


