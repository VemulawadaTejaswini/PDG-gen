import java.util.Scanner;

/**
 * http://abc069.contest.atcoder.jp/tasks/arc080_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long[] a = new long[N];
		for(int i=0; i<N; i++) a[i] = sc.nextLong();
		sc.close();
		
		int four = 0;
		int odds = 0;
		int evens = 0;
		int two = 0;
		for(int i=0; i<N; i++){
			if(a[i]==2){
				two++;
			}else if(a[i]%4==0){
				four++;
			}else if(a[i]%2==0){
				evens++;
			}else{
				odds++;
			}
		}
		
		boolean ans = (two==0 && evens==0 && four+1>=odds) ||
				(four>=odds && two+1>=evens-(four-odds));
		
		System.out.println(ans ? "Yes" : "No");

	}

}