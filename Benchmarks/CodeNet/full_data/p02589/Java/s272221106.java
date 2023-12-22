import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

import javax.transaction.xa.Xid;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		Trie trie=new Trie();
		String[] strings=new String[N];
		for (int i = 0; i < strings.length; i++) {
			strings[i]=new StringBuffer(sc.next()).reverse().toString();
		}
		long ans=0;
		Arrays.sort(strings,(s1,s2)->s1.length()-s2.length());
		for (int i = 0; i < strings.length; i++) {
			ans+=trie.count(strings[i]);
			trie.insert(strings[i], i);
		}
		System.out.println(ans);
	}
	static class Trie{
		class Node{
			int[] next=new int[26];//子
			ArrayList<Integer> accept=new ArrayList<>();//この頂点を末端とする文字列のID
			int c;
			int common;
			public Node(int c) {
				this.c=c;//nodeの表す文字
				Arrays.fill(next, -1);
			}
		}
		ArrayList<Node> nodes=new ArrayList<>();
		public Trie() {
			nodes.add(new Node(0));
		}
		void insert(String string,int str_id) {
			char[] cs=string.toCharArray();
			int node_id=0;
			for (int i = 0; i < cs.length; i++) {
				nodes.get(node_id).common++;
				int x=(int)cs[i]-'a';//辺に対応する文字
				int nextnode=nodes.get(node_id).next[x];
				if (nextnode==-1) {
					nextnode=nodes.size();
					nodes.get(node_id).next[x]=nodes.size();
					nodes.add(new Node(x));
				}
				node_id=nextnode;
			}
			nodes.get(node_id).common++;
			nodes.get(node_id).accept.add(str_id);
		}
		boolean search(String string) {
			char[] cs=string.toCharArray();
			int node_id=0;
			for (int i = 0; i < cs.length; i++) {
				int x=(int)cs[i]-'a';
				int nextnode=nodes.get(node_id).next[x];
				if (nextnode==-1) {
					return false;
				}
				node_id=nextnode;
			}
			if (nodes.get(node_id).accept.size()>0) {
				return true;
			}
			return false;
		}
		long count(String string){
			char[] cs=string.toCharArray();
			int node_id=0;
			long[] bitmask=new long[cs.length];
			long bitfirst=0;
			long ans=0; 
			for (int i = cs.length-2; i >= 0; i--) {
				bitmask[i]=bitmask[i+1]|((long)1<<((int)cs[i+1]-'a'));
			}
			bitfirst=bitmask[0]|(long)1<<((int)cs[0]-'a');
			for (int i = 0; i < 26; i++) {
				if ((1&(bitfirst>>i))==1) {
					int next=nodes.get(node_id).next[i];
					if (next!=-1) {
						ans+=nodes.get(next).accept.size();
					}
				}
			}
			for (int i = 0; i < cs.length; i++) {
				int x=(int)cs[i]-'a';
				int nextnode=nodes.get(node_id).next[x];
				if (nextnode==-1){
					return ans;
				}
				node_id=nextnode;
				for (int j = 0; j < 26; j++) {
					if ((1&(bitmask[i]>>j))==1) {
						int next=nodes.get(node_id).next[j];
						if (next!=-1) {
							ans+=nodes.get(next).accept.size();
						}
					}
				}
			}
			return ans;
		}
	}
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
	}
