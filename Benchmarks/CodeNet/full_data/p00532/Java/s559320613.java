import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		int[] s = new int[n];

		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			//i = [0, m-1]だが、m = [1, m]だから
		}	//まずa[i]を一通り読み込む
		
		for(int i = 0; i < m; i++) {	
			for(int j = 0; j < n; j++) {
				b[j] = sc.nextInt() - 1;
				
				if(b[j] == a[i]) {
					s[j] += 1;
				}
				else {
					s[a[i]] += 1;
				}
			}
		}
		
		for(int j = 0; j < n; j++) {
			System.out.println(s[j]);	
		}
		
		sc.close();
	}

}

