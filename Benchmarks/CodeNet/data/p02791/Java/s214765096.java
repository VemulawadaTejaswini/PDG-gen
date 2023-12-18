import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),ans=0;
		int[] p = new int[N];
		for(int i=0;i<N;i++) p[i]=sc.nextInt();
      	int m = p[0];
		for(int i=0;i<N;i++) {
			m = Math.min(m,p[i]);
          	if(m==p[i]) ans++;
		}
		System.out.println(ans);
	}
}