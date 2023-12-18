import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int max =0;
		for(int i=0; i<n-1; i++) {
			char ima = s.charAt(i);
			for(int j = i+1; j<n; j++) {
				//System.out.println(i+", "+j);
				if(s.charAt(j) == ima) {
					//System.out.println("a");
					for(int k = max; (k<n/2)&&(j+k<n); ) {
						//System.out.println("b");
						//System.out.println(k);
						String tmp1 = s.substring(i, i+k);
						String tmp2 = s.substring(j, j+k);
						if(tmp1.equals(tmp2)) {
							k++;
							max = Math.max(max, k);
						}
						else {
							k = n;
						}
					}
				}
			}
		}
		System.out.println(max);

	}
}
