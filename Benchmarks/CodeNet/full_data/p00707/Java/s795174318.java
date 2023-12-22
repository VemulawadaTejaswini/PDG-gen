import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			BigInteger[][] bi = new BigInteger[h+1][w+1];
			for(int i=0;i<=h;i++){
				for(int j=0;j<=w;j++){
					bi[i][j] = BigInteger.ZERO;
				}
			}
			
			BigInteger zero = BigInteger.ZERO;
			BigInteger max = BigInteger.ZERO;
			String s, t;
			for(int i=1;i<=h;i++){
				s = sc.next();
				for(int j=1;j<=w;j++){
					t = s.substring(j-1,j);
					if(t.codePointAt(0)<58){
						if(bi[i][j-1].compareTo(zero)==0 && bi[i-1][j].compareTo(zero)==0 && t.compareTo("0")==0) continue;
						BigInteger x = bi[i][j-1].multiply(BigInteger.TEN).add(new BigInteger(t));
						BigInteger y = bi[i-1][j].multiply(BigInteger.TEN).add(new BigInteger(t));
						if(x.compareTo(y)>0) bi[i][j] = x;
						else bi[i][j] = y;
						if(max.compareTo(bi[i][j])<0) max = bi[i][j];
					}
				}
			}
			System.out.println(max);
		}
	}	
}