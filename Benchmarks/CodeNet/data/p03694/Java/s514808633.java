import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min = 1000, max = 0,result = 0;
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(min > a[i]) min = a[i];
			if(max < a[i]) max = a[i];
		}
		result = max - min;
		System.out.print(result);

	}

}