import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

	public static void main(String [] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		try {
			String str = br.readLine();
			int n = Integer.parseInt(str);
			String eol = System.getProperty("line.separator");
			byte [] eolb = eol.getBytes();
			for(int i = 0 ; i < n ; i++) {
				str = br.readLine();
				int blank = str.indexOf(" ");
				BigInteger a = new BigInteger(str.substring(0,blank));
				str =str.substring(blank+1);
				blank = str.indexOf( " ");
				BigInteger b = new BigInteger(str.substring(0,blank));
				BigInteger c = new BigInteger(str.substring(blank+1));
				boolean is = false;
				a = a.multiply(a);
				b = b.multiply(b);
				c = c.multiply(c);
				BigInteger zero = new BigInteger("0");
				if( (a.compareTo(b.add(c)) == 0 ) || (b.compareTo(a.add(c)) == 0 ) || (c.compareTo(a.add(b)) == 0 ) ) {
					if ( ( a.compareTo(zero) != 0 ) && (b.compareTo(zero) != 0) && (c.compareTo(zero) != 0)) {
						is = true;
					}
				}
				if(is) {
					bos.write("YES".getBytes());
					bos.write(eolb);
				} else {
					bos.write("NO".getBytes());
					bos.write(eolb);
				}
			}
			bos.flush();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}