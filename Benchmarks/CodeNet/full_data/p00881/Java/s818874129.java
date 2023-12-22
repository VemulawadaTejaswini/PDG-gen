import java.util.Scanner;

//Twenty Questions
public class Main{

	int n, m, min;
	int[] s;
	long[] n1, n2, z1, z2;
	
	void f(int k, int p, long s1, long s2, int c){
		if(min<=c)return;
		if(Long.bitCount(s1)+Long.bitCount(s2)==1){
			min = Math.min(min, c); return;
		}
		if(k==m)return;
		f(k+1, p, s1, s2, c);
		if(((s[p]>>k)&1)>0)f(k+1, p, s1&n1[k], s2&n2[k], c+1);
		else f(k+1, p, s1&z1[k], s2&z2[k], c+1);
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
			int res = 0;
			long s1 = 1L<<Math.min(n, 64), s2 = 1L<<Math.max(n-64, 0);
			s1--; s2--;
			for(int i=0;i<n;i++){
				min = m;
				f(0, i, s1, s2, 0);
				res = Math.max(res, min);
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}