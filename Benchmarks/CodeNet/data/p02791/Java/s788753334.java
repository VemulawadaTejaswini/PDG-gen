import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int count = 1;
		int check=0;

		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}

		for(int i=1;i<n;i++) {
			check=0;
			for(int j=0;j<i;j++) {
				if(!(p[j]-p[i]>=0)) {
					check++;
					break;
				}
			}
			if(check==i) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
