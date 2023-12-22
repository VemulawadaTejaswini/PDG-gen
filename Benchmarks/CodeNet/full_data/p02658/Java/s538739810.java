import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long ans = 1;
		for(int i=0;i<N;++i){
			long A = sc.nextLong();
			long tmp = ans*A;
			if(tmp > 1000000000000000000L){
				ans = -1;
			}else{
				ans *= A;
			}
		}
		sc.close();
		if(ans < 0) ans = -1;
		System.out.println(ans);
	}
}
