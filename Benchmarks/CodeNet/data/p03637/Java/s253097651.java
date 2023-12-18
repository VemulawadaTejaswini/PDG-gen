import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int cnt2 = 0;
		int cnt4 = 0;
		int cntelse = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			
			if(a[i]%2==0 && a[i]%4 != 0) {
				cnt2++;
			}else if(a[i] % 4 == 0) {
				cnt4++;
			}else {
				cntelse++;
			}
		}
		
		if(cnt2==0) {
			if(cnt4+1>=cntelse) {
				System.out.println("Yes");
			}	
		}else if(cnt4 >= cntelse) {
			System.out.println("Yes");
		}else {
			System.out.println("No");			
		}
		
	}

}
