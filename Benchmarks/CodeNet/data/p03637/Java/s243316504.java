import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt4 = 0;
		int oddcnt = 0;
		int even = 0;
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(a[i]%2==1) {
				oddcnt++;
			}else if(a[i]%4==0) {
				cnt4++;
			}else {
				even++;
			}
		}
		if(even == 0 && cnt4+1>=oddcnt) {
			System.out.println("Yes");
		}else if(cnt4<oddcnt) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		sc.close();
	}





}
