import java.io.*;
import java.util.*;

public class Main{
	static void main() throws Exception{
		int n=sc.nextInt();
		int[]in=sc.intArr(3);
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('B', 1);
		map.put('C', 2);
		StringBuilder ans=new StringBuilder();
		char[][]arr=new char[n][];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine().toCharArray();
		}
		int i=0;
		while(i<n) {
			int option1=map.get(arr[i][0]),option2=map.get(arr[i][1]);
			if(in[option1]==0 && in[option2]==0) {
				pw.println("No");
				return;
			}
			if(in[option1]==0) {
				in[option1]++;
				in[option2]--;
				ans.append(arr[i][0]);ans.append('\n');
				i++;
				continue;
			}
			if(in[option2]==0) {
				in[option2]++;
				in[option1]--;
				ans.append(arr[i][1]);ans.append('\n');
				i++;
				continue;
			}
			if(i==n-1) {
				ans.append(arr[i][0]);ans.append('\n');
				break;
			}
			if(arr[i][0]==arr[i+1][0] || arr[i][0]==arr[i+1][1]) {
				ans.append(arr[i][0]);ans.append('\n');
				in[option2]--;
				if(arr[i][0]==arr[i+1][0]) {
					in[map.get(arr[i+1][1])]++;
					ans.append(arr[i+1][1]);ans.append('\n');
				}
				else {
					in[map.get(arr[i+1][0])]++;
					ans.append(arr[i+1][0]);ans.append('\n');
				}
				i+=2;
				continue;
			}
			in[option1]--;
			ans.append(arr[i][1]);ans.append('\n');
			if(arr[i][1]==arr[i+1][0]) {
				ans.append(arr[i+1][1]);ans.append('\n');
				in[map.get(arr[i+1][1])]++;
			}
			else {
				in[map.get(arr[i+1][0])]++;
				ans.append(arr[i+1][0]);ans.append('\n');
			}
			i+=2;
		}
		pw.println("Yes");
		pw.print(ans);
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public long[] longArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]inArr=new Integer[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]inArr=new Long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			int tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(long[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			long tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(String[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			String tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
}