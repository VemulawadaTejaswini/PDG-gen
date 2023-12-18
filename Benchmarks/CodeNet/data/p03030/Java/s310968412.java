import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String[] ss = new String[n];
		String[] t = new String[n];
		int[] ps = new int[n];
		for(int i=0; i<n; i++) {
			String s = scan.next();
			int p = scan.nextInt();
			p=100-p;
			String s2 = String.valueOf(p);
			ss[i] = s+s2;
			t[i] = s+s2;
		}
		
		Arrays.sort(ss);
		for(int i=0; i<n; i++) {
			//System.out.println(t[i]);
			
			for(int j=0; j<n; j++) {
				if(ss[i].equals(t[j])) {
					System.out.println(j+1);
				}
			}
		}
	}

}