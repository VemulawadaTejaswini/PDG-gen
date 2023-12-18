import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		int []sum = new int [n];
		
		for(int i = 0; i < n ;i++) {
			int cnt = 0;
			int l = i;
			if(c[i] == 'R') {
				while(true) {
					if(c[l+1] == 'L') {
						sum[l + (cnt % 2)]++;
						break;
					}
					else {
						cnt++;
						l++;
					}
				}
			}
			else {
				while(true) {
					if(c[l-1] == 'R') {
						sum[l - (cnt % 2)]++;
						break;
					}
					else {
						cnt++;
						l--;
					}
				}
			}
		}
		
		for(int i = 0; i < n ;i++) {
			System.out.print(sum[i] +" ");
		}
		System.out.println("");
		
		

	}

}
