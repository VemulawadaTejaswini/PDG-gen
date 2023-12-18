import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int m = l;
		int num = 0;
		m = m;
		while(m > 0) {
			m = m/2;
			num += 1;
		}
		int rest = l - (int)Math.pow(2, num-1);
		int a[] = new int[num];
		int i = 0;
		while(rest > 0) {
			a[i] = rest % 2;
			rest = rest/2;
			i += 1;
		}

		int road = 0;

		for(int j = 0;j<a.length;j++) {
			road += a[j];
		}
		road = road + 2*(num -1);

		System.out.println(num + " " + road);
		for(int j=0;j<num-1;j++) {
			System.out.println((j+1) + " " + (j+2) + " " + 0);
			System.out.println((j+1) + " " + (j+2) + " " + (int)Math.pow(2, j));
		}
		int rsum = 0;
		for(int j=0;j<num;j++) {
			if(a[j] == 1) {
				System.out.println((j+1) + " " + num + " " + ((int)Math.pow(2, num-1) + rsum));
				rsum += (int)Math.pow(2, j);
			}
		}

	}
}