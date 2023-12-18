import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final long x = sc.nextLong();
		final long y = sc.nextLong();
		
		final boolean same_sign = Long.signum(x) == Long.signum(y);
		
		if(x == 0){ // 目的の数に合わせて正負を変える
			System.out.println((y >= 0) ? y : y + 1);
		}else{
			if(Math.abs(x) == Math.abs(y)){ // 符号違い
				System.out.println(same_sign ? 0 : 1);
			}else {
				if(Math.abs(x) < Math.abs(y)){
					if(x < 0){
						System.out.println(1 + (Math.abs(y) - Math.abs(x)) + (y < 0 ? 1 : 0));
					}else{
						System.out.println(0 + (Math.abs(y) - Math.abs(x)) + (y < 0 ? 1 : 0));
					}
				}else if(Math.abs(x) > Math.abs(y)){
					if(x > 0){
						System.out.println(1 + (Math.abs(x) - Math.abs(y)) + (y > 0 ? 1 : 0));
					}else{
						System.out.println(0 + (Math.abs(x) - Math.abs(y)) + (y > 0 ? 1 : 0));
					}
				}
			}
		}
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}