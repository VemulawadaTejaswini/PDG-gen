import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //xが素数か判定する
    static boolean isPrimeNum( int x ) {
        if( x == 2 ) return true;
        if( x < 2 || x % 2 == 0 ) return false;
        for( int n = 3; n <= Math.sqrt((double)x); n += 2 )
            if( x % n == 0 ) return false;
        return true;
    }

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		/*<考察>
		 * 一番小さい因数にそれぞれを置き換える
		 * そして並び替え。
		 * 最後にa[i] != a[i+1]のものを全探索し、+1すれば解ける？
		 * 素数ならすぐに抜けるようにする
		*/
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		/*		for(int i = 0; i < n; i++) {
					
					if(a[i] == 1) {
						continue;
					}
		
					
					if(isPrimeNum(a[i])) {
						continue;
					}else { //もし素数でなければ
						
						for(int j = 2; j*j <= a[i]; j++) {
							if(a[i] % j == 0) {
								a[i] = j;
							}
						}
						
						
					}
				}
				
				Arrays.parallelSort(a);
				long cnt = 0;
				
				for(int i = 0; i < n-1; i++) {
					if(a[i]!=a[i+1]) {
						cnt++;
					}
				}
				
				if(a[n-2]!=a[n-1]) {
					cnt++;
				}
				
				System.out.println(cnt);
				*/

		
		Arrays.parallelSort(a);
		long cnt = 0;
		
		for(int i = 0; i < n-1; i++) {
			boolean flag = true;
			if(a[i] == a[i+1]) { //2 2 3 4 8のように2 2が同じだった時
				continue;
			}
			
			for(int j = 0; j < i; j++) {
				if(a[i] % a[j] == 0) {
					flag = false;
					break;
				}
			}
			if(flag)cnt++;
		}
		
		boolean flag2 = true;
		for(int i = 0; i < n-1; i++) {
			if(a[n-1]%a[i] == 0) {
				flag2 = false;
				break;
			}
		}
		
		if(flag2)cnt++;
		
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
