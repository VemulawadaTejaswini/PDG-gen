import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try{
			InputStreamReader isr =new InputStreamReader(System.in);
	   		BufferedReader br =new BufferedReader(isr);
	        String buf = br.readLine();
	        StringTokenizer st = new StringTokenizer(buf," ");
	    	final int n = Integer.parseInt(st.nextToken());
	        final int m = Integer.parseInt(st.nextToken());
	        if (n < 1 || m < 1 || m > 100000 || m > 100000) {
	        	throw new IllegalArgumentException();
	        }
	        String s = br.readLine();
	        String t = br.readLine();
	        if (s.length() != n || t.length() != m) {
	        	throw new IllegalArgumentException();
	        }
	        if (!isExistGoodString(s, t)) {
	        	System.out.println(-1);
	        	return;
	        }
	        // a: n, m のどちらでも割り切れる最小の数(最小公倍数)
	        int a = -1;
	        int i = 1;
	        while (i != Integer.MAX_VALUE) {
	        	if (i % n == 0 && i % m == 0) {
	        		a = i;
	        		break;
	        	}
	        	i++;
	        }
	        if (a == -1) {
	        	throw new IllegalArgumentException();
	        }
	        i = a;
	        while (i < Integer.MAX_VALUE - a) {
	        	if (isExistGoodString(i, s, t)) {
	        		System.out.println(i);
	        		break;
	        	}
	        	i += a;
	        }
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.err.println("1 ≦ N, M ≦ 10^5 を満たす必要があります。");
		}
	}

	private static boolean isExistGoodString(final String s, final String t) {
		int n = s.length();
		int m = t.length();
		if (s.charAt(0) != t.charAt(0)) {
			return false;
		}
		if (n >= m && n % m == 0) {
			int l = n / m;
			int i = 0;
			while (i < m) {
				if (s.charAt(i * l) != t.charAt(i)) {
					return false;
				}
				i++;
			}
		} else if (n < m && m % n == 0) {
			int l = m / n;
			int i = 0;
			while (i < m) {
				if (s.charAt(i) != t.charAt(i * l)) {
					return false;
				}
				i++;
			}
		}
		return true;
	}

	private static boolean isExistGoodString(final int i, final String s, final String t) throws IllegalArgumentException {
		if (i < 1) {
	        throw new IllegalArgumentException();
	    }
		char[] x = new char[i];
		int j = 0;
		int n = s.length();
		int m = t.length();
		while (j < x.length) {
			x[j] = '0';
			j++;
		}
		j = 0;
		while (j < n) {
			x[i / n * j] = s.charAt(j);
			j++;
		}
		j = 0;
		while (j < m) {
			if (x[i / m * j] == '0') {
				x[i / m * j] = t.charAt(j);
			} else if (x[i / m * j] != t.charAt(j)) {
				return false;
			}
			j++;
		}
		return true;
	}
}