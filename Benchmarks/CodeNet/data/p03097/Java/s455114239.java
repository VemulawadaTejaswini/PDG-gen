




import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int size = 1<<n;
		
		int[] gray = new int[size];
		for (int i=0;i<size;i++) {
			gray[i]=i^(i>>1);
		}
		
		int diff = a^b;
		if (Integer.highestOneBit(diff) != diff) {
			System.out.println("NO");
			return;
		}
		
		int pos = 0;
		for (int i=0;i<size;i++) {
			if ((gray[i]^gray[i+1]) == (a^b)) {
				pos = i+1;
				break;
			}
		}
		System.out.println("YES");
		for (int i=0;i<size;i++) {
			System.out.print(gray[(pos+i)%size]^gray[pos]^a);
			if (i<size-1) {
				System.out.print(" ");
			} else {
				System.out.println("");
			}
		}
	}



}
