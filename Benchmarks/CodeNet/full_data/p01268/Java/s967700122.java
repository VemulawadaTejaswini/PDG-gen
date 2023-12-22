import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> p = new ArrayList<Integer>();
		BigInteger to = new BigInteger("102000");

		for(BigInteger x = BigInteger.ONE;x.compareTo(to)<0;){
			x = x.nextProbablePrime();
			p.add(Integer.parseInt(x.toString()));
		}

		while(true){
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			if(n == -1 && m == -1) break;

			int start = 0;
			for(;p.get(start)<=n;start++);

			ArrayList<Integer> sum = new ArrayList<Integer>();
			int size = start + m;
			for(int i=start;i<size;i++){
				for(int j=i;j<size;j++){
					sum.add(p.get(i) + p.get(j));
				}
			}
			Collections.sort(sum);
			System.out.println(sum.get(m-1));
		}
	}
}