import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		long max, min, sum;
		max = min = sum = 0;
		for(int i=1; i<=s; i++) {
			long a = sc.nextInt();
			if(i==1) max=min=a;
			if(max<a) max=a;
			else if(min>a) min=a;
			sum+=a;
		}
		System.out.printf("%s %s %s\n", min, max, sum);
	}
}

