import java.util.Arrays;
import java.util.Scanner;

//Twenty Questions
public class Main{

	int n, m, min;
	int[] s, ret;
	long[] n1, n2, z1, z2;
	
	void f(int k, long s1, long s2, int c){
		if(Long.bitCount(s1)+Long.bitCount(s2)==1){
			int x = 0;
			if(Long.bitCount(s1)==1)x = Long.numberOfTrailingZeros(s1);
			else x = Long.numberOfTrailingZeros(s2)+64;
			ret[x] = Math.min(ret[x], c);
			return;
		}
		if(k==m)return;
		f(k+1, s1, s2, c);
		f(k+1, s1&n1[k], s2&n2[k], c+1);
		f(k+1, s1&z1[k], s2&z2[k], c+1);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			m = sc.nextInt(); n = sc.nextInt();
			if((m|n)==0)break;
			s = new int[n];
			n1 = new long[m]; n2 = new long[m];
			z1 = new long[m]; z2 = new long[m];
			for(int i=0;i<n;i++){
				s[i] = Integer.parseInt(sc.next(), 2);
				for(int j=0;j<m;j++){
					if(((s[i]>>j)&1)>0){
						if(64<=i)n2[j]+=1L<<(i-64);
						else n1[j]+=1L<<i;
					}
					else{
						if(64<=i)z2[j]+=1L<<(i-64);
						else z1[j]+=1L<<i;
					}
				}
			}
			long s1 = 1L<<Math.min(n, 64), s2 = 1L<<Math.max(n-64, 0);
			s1--; s2--;
			ret = new int[n];
			Arrays.fill(ret, m);
			f(0, s1, s2, 0);
			int res = 0;
			for(int i=0;i<n;i++)res = Math.max(res, ret[i]);
//			for(int i=0;i<n;i++){
//				min = m;
//				f(0, i, s1, s2, 0);
//				res = Math.max(res, min);
//			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}