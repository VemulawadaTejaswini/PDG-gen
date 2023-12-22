import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// ReverseSort
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int n;
	int[] a;

	int base=50;

	void run(){
		n=sc.nextInt();
		a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		HashMap<Long, Integer> map1=hoge(a);
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			b[i]=i+1;
		}
		HashMap<Long, Integer> map2=hoge(b);
		int min=INF;
		for(Entry<Long, Integer> entry : map1.entrySet()){
			long hash=entry.getKey();
			int num=entry.getValue();
			if(map2.containsKey(hash)){
				min=min(min, num+map2.get(hash));
			}
		}
		if(min<INF){
			println(min+"");
		}else{
			// answer > 4+4
			println("9");
		}
	}

	HashMap<Long, Integer> hoge(int[] a){
		HashMap<Long, Integer> map=new HashMap<Long, Integer>();
		LinkedList<Long> que=new LinkedList<Long>();

		long[] pow=new long[n];
		for(int i=0; i<n; i++){
			pow[i]=(long)pow(base, i);
		}

		long hash0=hash(a);
		map.put(hash0, 0);
		que.offer(hash0);

		for(; !que.isEmpty();){
			long hash=que.poll();
			if(map.get(hash)>=4){
				break;
			}
			for(int cent=0; cent<n; cent++){
				// odd length
				long hashO=hash;
				for(int w=1; cent-w>=0&&cent+w<n; w++){
					// [cent-w, cent+w]
					long i=hashO/pow[cent-w]%base;
					long j=hashO/pow[cent+w]%base;
					hashO=hashO+(-i+j)*pow[cent-w]+(-j+i)*pow[cent+w];
					if(!map.containsKey(hashO)){
						map.put(hashO, map.get(hash)+1);
						que.offer(hashO);
					}
				}
				// even length
				long hashE=hash;
				for(int w=0; cent-w>=0&&cent+1+w<n; w++){
					// [cent-w, cent+1+w]
					long i=hashE/pow[cent-w]%base;
					long j=hashE/pow[cent+1+w]%base;
					hashE=hashE+(-i+j)*pow[cent-w]+(-j+i)*pow[cent+1+w];
					if(!map.containsKey(hashE)){
						map.put(hashE, map.get(hash)+1);
						que.offer(hashE);
					}
				}
			}
		}
		return map;
	}

	long hash(int[] _){
		long hash=0;
		for(int i=0; i<n; i++){
			hash=hash*base+_[i];
		}
		return hash;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}