
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.AbstractDocument.BranchElement;

import org.w3c.dom.css.Counter;
 
public class Main {

	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		String first = fs.next();
		char[ ]a = first.toCharArray();
		int sum = 0;
		for(int i =0;i<a.length;i++) {
			sum=sum+ (a[i]-'0');
		}

		if(sum%9==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
 
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
 
	
}