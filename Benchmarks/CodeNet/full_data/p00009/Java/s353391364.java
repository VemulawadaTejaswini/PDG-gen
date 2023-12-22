import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
public class Main {
	public static void main(String[] args) throws IOException {
		int n;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		BitSet bs = new BitSet(1000000);
		bs.set(2,1000000,true);
		for(int i=2;i<=1000;i++){
			if(!bs.get(i))continue;
			for(int j=i*2;j<=1000;j+=i)bs.clear(j);
		}
		while((str=bf.readLine())!=null){
			n=Integer.parseInt(str);
			System.out.println(bs.get(2,n+1).cardinality());
		}
	}
}