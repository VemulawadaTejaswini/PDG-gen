import java.io.*;
import java.util.*;
import java.math.*;

class Main{
	static final int nbits = 64;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		BitSet[] bs = new BitSet[n];
		for(int i = 0; i < n; i++){
			bs[i] = new BitSet(nbits);
			str = br.readLine().split(" ");
			int k = Integer.parseInt(str[0]);
			for(int j = 0; j < k; j++){
				bs[i].set(Integer.parseInt(str[j + 1]));
			}
		}
		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		BitSet bs2 = new BitSet(nbits);
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int op = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			if(op == 0){
				pw.println(bs2.get(m) ? 1 : 0);
			}else if(op == 1){
				for(int j = 0; j < nbits; j++){
					if(bs[m].get(j)) bs2.set(j);
				}
			}else if(op == 2){
				for(int j = 0; j < nbits; j++){
					if(bs[m].get(j)) bs2.clear(j);
				}
			}else if(op == 3){
				for(int j = 0; j < nbits; j++){
					if(bs[m].get(j)) bs2.flip(j);
				}
			}else if(op == 4){
				boolean flag = true;
				for(int j = 0; j < nbits; j++){
					if(!bs[m].get(j)) continue;
					if(!bs2.get(j)) flag = false;
				}
				pw.println(flag ? 1 : 0);
			}else if(op == 5){
				boolean flag = false;
				for(int j = 0; j < nbits; j++){
					if(!bs[m].get(j)) continue;
					if(bs2.get(j)) flag = true;
				}
				pw.println(flag ? 1 : 0);
			}else if(op == 6){
				boolean flag = true;
				for(int j = 0; j < nbits; j++){
					if(!bs[m].get(j)) continue;
					if(bs2.get(j)) flag = false;
				}
				pw.println(flag ? 1 : 0);
			}else if(op == 7){
				int cnt = 0;
				for(int j = 0; j < nbits; j++){
					if(!bs[m].get(j)) continue;
					if(bs2.get(j)) cnt = cnt + 1;
				}
				pw.println(cnt);
			}else{
				BigInteger sum = BigInteger.ZERO;
				BigInteger pow2 = BigInteger.ONE;
				for(int j = 0; j < nbits; j++){
					if(bs[m].get(j) && bs2.get(j)) sum = sum.add(pow2);
					pow2 = pow2.multiply(new BigInteger(String.valueOf(2)));
				}
				pw.println(sum);
			}
		}
		pw.close();
	}
}

