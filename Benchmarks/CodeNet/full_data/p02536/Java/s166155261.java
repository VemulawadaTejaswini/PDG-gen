import java.io.*;
import java.util.*;
 
public class Main{
    static class FastReader{
        BufferedReader br;
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
    static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
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
    public static void main(String[] args) throws NumberFormatException, IOException {
        FastReader st = new FastReader();
        int ans=0;
        int n = st.nextInt();
        int m = st.nextInt();
        Node[] node = new Node[n];
        for(int i=0;i<n;i++) node[i] = new Node();
        for(int i=0;i<m;i++) {
        	int a = st.nextInt(),b = st.nextInt();
        	node[a-1].adj.add(node[b-1]);
        	node[b-1].adj.add(node[a-1]);
        }
        dfs(node[0]);
        for(int i=0;i<n;i++) {
        	if(!node[i].vis) {
        		dfs(node[i]);
        		ans++;
        	}
        }
        System.out.println(ans);
    }
    static void dfs(Node from) {
    	from.vis = true;
    	for(Node nn:from.adj) {
    		if(!nn.vis) {
    			nn.vis = true;
    			dfs(nn);
    		}
    	}
    }
    static class Node{
    	boolean vis = false;
    	ArrayList<Node> adj = new ArrayList<>();
    }
}