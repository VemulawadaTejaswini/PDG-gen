import java.io.*;
import java.util.*;

 
public class Main{
	static class FastReader{
        BufferedReader br,br1;
        StringTokenizer st;
        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}
        public FastReader(String fileName) throws FileNotFoundException{br = new BufferedReader(new FileReader(fileName));}
        String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}
        int nextInt(){return Integer.parseInt(next());}
        long nextLong(){return Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}
        char[][] readCharArray(int n,int m) {
        	String str;
        	char[][] arr = new char[n][m];
        	for(int i=0;i<n;i++) {
        		str=nextLine();
        		for(int j=0;j<n;j++) {
        			arr[i][j]=str.charAt(j);
        		}
        	}
        	return arr;
        }
        char[][] readCharArray(int n){
        	return readCharArray(n,n);
        }
        int[] readArray(int n){int[] a=new int[n];for (int i=0; i<n; i++) a[i]=nextInt();return a;}
        long[] readLongArray(int n){long[] a=new long[n];for (int i=0; i<n; i++) a[i]=nextLong();return a;}
        String nextLine(){String str = "";try{str = br.readLine();}catch (IOException e){e.printStackTrace();}return str;}
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
    static List<Integer>[] arr;
	static boolean[] vis;
    static void addEdge(int n,int m) {
		if(!arr[n-1].contains(m-1)) arr[n-1].add(m-1);
		if(!arr[m-1].contains(n-1)) arr[m-1].add(n-1);
	}
    public static void main(String[] args) throws NumberFormatException, IOException {
//    	long time = System.currentTimeMillis();
//		FastReader st = new FastReader("src/input.txt");
//		PrintWriter out = new PrintWriter(new FileWriter("src/output.txt"));
    	FastReader st = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = st.nextInt();
        int m = st.nextInt();
        int temp,len,ele;
        arr = new List[n];
        vis = new boolean[n];
        for(int i=0;i<n;i++) arr[i] = new ArrayList<Integer>();
        for(int i=0;i<m;i++) addEdge(st.nextInt(),st.nextInt());
        Stack<Integer> s = new Stack<Integer>();
        int count=1,ans=0;
        for(int j=0;j<n;j++) {
        	if(!vis[j]) {
        		vis[j]=true;
        		s.push(j);
            	count=1;
            	while(s.size()!=0) {
            		temp = s.pop();
            		len = arr[temp].size();
            		for(int i=0;i<len;i++) {
                		ele = arr[temp].get(i);
            			if(!vis[ele]) {
            				vis[ele]=true;
            				count++;
            				s.push(ele);
            			}
            		}
            	}
            	ans = Math.max(ans, count);
        	}
        }
        out.println(ans);
        out.close();
//        System.err.println(System.currentTimeMillis()-time);
    }
}
