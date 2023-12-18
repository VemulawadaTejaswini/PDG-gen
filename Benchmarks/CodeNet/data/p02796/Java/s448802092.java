import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		//String g = sc.next();
		int n = sc.nextInt();
		//long w = sc.nextLong();
		//long n = sc.nextLong();
		//long l = sc.nextLong();
		//String buff="Christmas";
		long count=0;
		long buff=0;
		long[][] array=new long[n][2];
		//long[] arrayl=new long[n];

		for(int i=0;i<n;i++) {
			array[i][0]=sc.nextLong();
			array[i][1]=sc.nextLong();
		}
		Arrays.sort(array, (a, b) -> Long.compare(a[0], b[0]));
		for(int i=0;i<n-1;i++) {
			if(array[i][0]+array[i][1]>=array[i+1][0]) {
				count++;
				i++;
			}
		}

		/*if() {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}*/
		System.out.println(n-count);
		//System.out.println(Math.abs(array[2]-array[1])+Math.abs(array[1]-array[0]));
	}
}


