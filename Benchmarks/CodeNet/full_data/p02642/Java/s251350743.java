import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
		}
		Arrays.sort(a);
        int count = 0;
        int ans = 0;
        for (int c = 0; c < n; c++) {
            for(int b = 0; b < n; b ++) {
                if(!(a[c] == a[b]) && !(a[c] % a[b] == 0)){
					count++;
				}
				else if(a[c] < a[b]){
				break;
				}
			}
			if(count == n - 1){
				ans++;
			}
			count = 0;
		}
		System.out.println(ans);
    }
}