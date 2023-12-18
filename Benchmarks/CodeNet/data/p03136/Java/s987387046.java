import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] array=new int[s];
		int sum=0;
		for(int i=0;i<s;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<s-1;i++) {
			sum+=array[i];
		}
		if(array[s-1]<sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


