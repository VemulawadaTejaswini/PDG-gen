import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		ArrayList<Long> a = new ArrayList<Long>();
		ArrayList<Long> b = new ArrayList<Long>();
		for(long i = 0; i < n; i++){
			a.add(sc.nextLong());
			b.add(sc.nextLong());
		}
		long ans = 0;
		long ansb = 0;
		long i = 1;
		while(ansb != m){
			int idx = a.indexOf(i);
			if(idx == -1){
				i++;
			}else{
				long geta = a.get(idx);
				long getb = b.get(idx);
				if(ansb+getb > m){
					ans =(long)ans+geta*(m-ansb);
					ansb = m;
				}else{
					ansb+=getb;
					ans =(long)ans+geta*getb;
					a.remove(idx);
					b.remove(idx);
				}
			}
		}
		System.out.print(ans);
	}
}
