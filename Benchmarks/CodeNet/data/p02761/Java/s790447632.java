import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),M=sc.nextInt(),s[]=new int[M],c[]=new int[M];
		Map<Integer,Integer> a=new HashMap<Integer,Integer>();
		int ans=0;
		for(int i=0;i<M;i++) {
			s[i]=sc.nextInt();
			c[i]=sc.nextInt();
			if(!a.containsKey(s[i]-1)) {
				a.put(s[i]-1, c[i]);
			}else {
				if(a.get(s[i]-1)!=c[i]) {
					ans=-1;
					break;
				}
			}
		}
		if(ans!=-1) {
			for(int i=0;i<N;i++) {
				if(a.containsKey(i)) {
					ans+=a.get(i)*(int)Math.pow(10,N-i-1);
				}
			}
		}
		System.out.println(ans);
	}
}