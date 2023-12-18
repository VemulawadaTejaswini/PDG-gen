import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		String[] pp = new String[n];
		for(int i=0;i<n;i++) {
			String s = sc.next();
			String[] po = s.split(""); 
			Arrays.sort(po);
			s = "";
			for(int k=0;k<po.length;k++) {
				s += po[k];
			}
			pp[i] =s;
		}
		Arrays.sort(pp);
		int i=-1;
		while(i<n) {
			i++;
			for(int k=i+1;k<n;k++) {
				if(!pp[i].equals(pp[k])) {
					ans+= ((k-1)-i)*(k-i)/2;
					i=k-1;
					break;
				}
				if(k==n-1) {
					ans+= (k-i+1)*(k-i)/2;
					break;
				}
			}
			
		}
		System.out.println(ans);
	}
}