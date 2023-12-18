import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			a[i] = x;
			if(x<min) {
				min = x;
				minIdx = i;
			}
			if(x>max) {
				max = x;
				maxIdx = i;
			}
		}
		in.close();
		boolean plus = Math.abs(max) >= Math.abs(min);
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		if(plus) {
			for(int i=0;i<n;i++) {
				if(i==maxIdx) continue;
				sb.append((maxIdx+1) + " " + (i+1) + ls);
			}
			for(int i=1;i<n;i++) {
				sb.append(i + " " + (i+1) + ls);
			}
		}else {
			for(int i=0;i<n;i++) {
				if(i==minIdx) continue;
				sb.append((minIdx+1) + " " + (i+1) + ls);
			}
			for(int i=n-1;i>=1;i--) {
				sb.append((i+1) + " " + i + ls);
			}
		}
		System.out.println(2*n-2);
		System.out.println(sb.toString());
		

	}

}
