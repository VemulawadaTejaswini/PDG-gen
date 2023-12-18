
// LM10: The next Ballon d'Or
import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    static class FastReader
    {
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public FastReader() { this(System.in); }public FastReader(InputStream is) { mIs = is;}
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}
        public String next(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}
        public double d() throws IOException {return Double.parseDouble(next()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }
        public void scanIntArr(int [] arr){ for(int li=0;li<arr.length;++li){ arr[li]=i();}}
        public void scanLongArr(long [] arr){for (int i=0;i<arr.length;++i){arr[i]=l();}}
        public void shuffle(int [] arr){ for(int i=arr.length;i>0;--i) { int r=(int)(Math.random()*i); int temp=arr[i-1]; arr[i-1]=arr[r]; arr[r]=temp; } }
    }
    public static int [] topologicalOrder;
    static int topIndex=0;

    public static void main(String[] args)throws IOException {
        /*
Sample Input 1
Copy
4 5
1 2
1 3
3 2
2 4
3 4
Sample Output 1
Copy
3


5 5
2 1
2 3
2 4
1 3
3 5
*/
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int t=1;
        for(int ti=0;ti<t;++ti)
        {
            int n=fr.i();
            int m=fr.i();
            LinkedList<Edge> adjList []=new LinkedList[n+1];
            Node [] nodeArr=new Node[n+1];
            for(int ni=1;ni<=n;++ni)
            {
                nodeArr[ni]=new Node(ni);
                adjList[ni]=new LinkedList<>();
            }
            for(int mi=1;mi<=m;++mi)
            {
                int s=fr.i();
                int d=fr.i();
                Edge e1=new Edge(s,d);
                adjList[s].add(e1);
            }
            boolean [] visited=new boolean[n+1];

            topologicalOrder=new int[n+1];
            topIndex=1;
            for(int ni=1;ni<=n;++ni) {
                if(!visited[ni])
                DFS(adjList, visited, nodeArr, ni);
            }
            for(int ni=1;ni<=topologicalOrder.length/2;++ni)
            {
                int temp=topologicalOrder[ni];
                topologicalOrder[ni]=topologicalOrder[n-ni+1];
                topologicalOrder[n-ni+1]=temp;
            }
            //pw.println(Arrays.toString(topologicalOrder));
            int [] dp=new int[n+1];
            int min=Integer.MAX_VALUE;
            for(int index=1;index<=n;++index)
            {
                Iterator<Edge> itr=adjList[topologicalOrder[index]].listIterator();
                while(itr.hasNext())
                {
                    Edge e=itr.next();
                    dp[e.dest]=Math.min(dp[e.dest],dp[e.source]-1);
                    min=Math.min(min,dp[e.dest]);
                }
            }
            pw.println(min*-1);
        }
        pw.flush();
        pw.close();
    }
    static class Edge
    {
        int source,dest;
        Edge(int s,int d)
        {
            source=s;
            dest=d;
        }
    }
    static class Node
    {
        int id;
        Node(int i)
        {
            id=i;
        }
    }
    public static void DFS(LinkedList<Edge> adjList [], boolean [] visited, Node [] nodeArr,int source)
    {
        if(visited[source])
            return;
       //System.out.println("source="+source);
        visited[source]=true;
        Iterator<Edge> itr=adjList[source].listIterator();
        while(itr.hasNext())
        {
            Edge e=itr.next();
            if(!visited[e.dest])
            {
                DFS(adjList,visited,nodeArr,e.dest);
            }
        }
        //System.out.println("topIndex="+topIndex+" source="+source);
        topologicalOrder[topIndex]=source;
        ++topIndex;
        return;
    }
}