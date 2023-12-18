import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		ArrayList<Long> a = new ArrayList<Long>();
		ArrayList<Long> b = new ArrayList<Long>();
		ArrayList<Long> a2 = new ArrayList<Long>();
		for(int i = 0; i < n; i++){
			a.add(sc.nextLong());
			a2.add(a.get(i));
			b.add(sc.nextLong());
		}
		Collections.sort(a2);
		long ans = 0;
		long ansb = 0;
		long i = a2.get(0);
		while(ansb != m){
			int idx = a.indexOf(i);
			if(idx == -1){
				a2.remove(0);
				i = a2.get(0);
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
