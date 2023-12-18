import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		int ans = 0;

		for(int i=0;i<n;i++){
			l[i] = sc.nextInt();
		}

		Arrays.sort(l);

		for(int j=0;j<k;j++){
			ans += l[n-j-1];
		}

		System.out.println(ans);
		}
	}