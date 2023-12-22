import java.util.Arrays;
import java.util.Scanner;


public class Main{

	
	public static void main(String[] args){
		
		byte[] bof = new byte[80];
		Arrays.fill(bof, (byte)9);
		BigInteger overflow = new BigInteger(bof);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String str1 = sc.next();
			String str2 = sc.next();
			byte[] b1 = strToByteArray(str1);
			byte[] b2 = strToByteArray(str2);
			BigInteger i1 = new BigInteger(b1);
			BigInteger i2 = new BigInteger(b2);
			BigInteger sum = BigInteger.sum(i1, i2);
			
			if(BigInteger.isABiggerThanB(i1, overflow) || BigInteger.isABiggerThanB(i2, overflow) || BigInteger.isABiggerThanB(sum, overflow)) System.out.println("overflow");
			else System.out.println(sum);
		}
		sc.close();
	}
	
	static byte[] strToByteArray(String cs) {
		byte[] result = new byte[cs.length()];
		for(int i = 0; i < cs.length(); i++) {
			result[cs.length() - i - 1] = Byte.parseByte(Character.toString(cs.charAt(i)));
		}
		return result;
	}
}

class BigInteger{
	byte[] ds;
	BigInteger(byte[] d){
		int i;
		for(i = d.length-1; i >= 0; i--) {
			if(d[i] != 0) break;
		}
		
		this.ds = Arrays.copyOfRange(d, 0, i+1);
	}
	
	static boolean isABiggerThanB(BigInteger a, BigInteger b) {
		if(a.ds.length > b.ds.length) return true;
		else if(a.ds.length < b.ds.length) return false;
		else {
			return a.ds[a.ds.length-1] > b.ds[b.ds.length-1];
		}
	}

	
	static BigInteger sum(BigInteger i1, BigInteger i2) {
		if(isABiggerThanB(i1, i2)) return subsum(i1, i2);
		else return subsum(i2, i1);
	}
	
	static BigInteger subsum(BigInteger i1, BigInteger i2) {
		int digit = (i1.ds.length > i2.ds.length)? i1.ds.length + 2: i2.ds.length + 2;
		byte[]	ds = new byte[digit];
		boolean c_up = false;
		int i;
		for(i = 0; i < i1.ds.length; i++) {
			ds[i] = (i < i2.ds.length)? (byte) (i1.ds[i] + i2.ds[i]): i1.ds[i];
			if(c_up) ds[i]++;
			if(ds[i] > 9) {
				ds[i] = (byte) (ds[i] % 10);
				c_up = true;
			}else c_up = false;
		}
		if(c_up) ds[i]++;
		return new BigInteger(ds);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = ds.length - 1; i >= 0; i-- ) {
			sb.append(ds[i]);
		}
		return sb.toString();
	}
}