import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	static HashMap<String, Long> map = new HashMap<String, Long>();
	static int n,a;
	static int[] x;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		a = Integer.parseInt(str[1]);
		String[] str1 = br.readLine().split(" ");
		x = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = Integer.parseInt(str1[i]);
		}
		BitSet bs = new BitSet(n);
		bs.flip(0,n);

		long sum = solve(bs);
		sb.append(sum);
		System.out.println(sb);
	}

	public static long solve(BitSet bs){
		long hit = 0;

		//memo check
		String s = bs.toString();
		if(map.containsKey(s))
			return 0;

		for(int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i+1)){
			BitSet tmp = (BitSet)bs.clone();
			tmp.flip(i,i+1);
			hit += solve(tmp);
		}

		int sum=0,cnt=0;
		for(int i = 0; i < n; i++){
			if(!bs.get(i)){
				sum += x[i];
				cnt++;
			}
		}
		double ave = 1.0*sum/cnt;
		if(cnt!=0 && ave == a){
			hit++;
		}

		//memo
		map.put(bs.toString(), hit);
		//System.out.println(hit);
		return hit;
	}
}