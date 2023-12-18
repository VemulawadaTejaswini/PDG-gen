
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] l = new Integer[n];
		for(int i=0;i<n;i++) {
			l[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(l,Comparator.reverseOrder());
		int ans = 0;
		int k=0;
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1; j<n-1;j++) {
				for(k=j+1; k<n; k++) {
					if(l[i] < l[j]+l[k]) {
						ans++;
					}else {
						break;
					}
				}
				if(k==j+1) {
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
