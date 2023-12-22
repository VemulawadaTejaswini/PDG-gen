import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			if(n == -1 && m == -1) break;

			BigInteger x = BigInteger.valueOf(n);
			ArrayList<Integer> p = new ArrayList<Integer>();
			for(int i=0;i<m;i++){
				x = x.nextProbablePrime();
				p.add(Integer.parseInt(x.toString()));
			}
			int size = p.size();
			ArrayList<Integer> sum = new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				for(int j=i;j<size;j++){
					sum.add(p.get(i) + p.get(j));
				}
			}
			Collections.sort(sum);
			System.out.println(sum.get(m-1));
		}
	}
}