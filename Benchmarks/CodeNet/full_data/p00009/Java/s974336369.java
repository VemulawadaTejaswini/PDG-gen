import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		BitSet bit = new BitSet(1000000);
		bit.set(0);
		bit.set(1);

		for(int i=2; i<1000; ++i){
			if(!bit.get(i)){
				for(int j=i*2; j<1000000; j+=i)
					bit.set(j);
			}
		}

		int[] prime = new int[1000000];
		prime[0] = 0;
		for(int i=1; i<1000000; ++i)
			prime[i] = prime[i-1] + (bit.get(i) ? 0 : 1);

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try{
			while((str = bf.readLine()) != null){
				int n = Integer.parseInt(str);
				System.out.println(prime[n]);
			}
		}
		catch(IOException ex){
			System.out.println(ex);
		}
	}
}