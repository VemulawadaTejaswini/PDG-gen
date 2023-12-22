

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    static boolean[] vis;
    static List<Integer> list=new ArrayList<>();
    static int min=Integer.MAX_VALUE;
    static boolean[] visited;
    static int[] ans;
    static  List<Integer> visiteds=new ArrayList<>();
    static void dfs(LinkedList<Integer>[] lin,int src){
        if(src==1){
            if(list.size()<min) {
                //visiteds=new boolean[ans.length];
                visiteds=new ArrayList<>();
                List<Integer> lis=new ArrayList<>();
                for(int j=0;j<list.size();j++){
                    //visited[list.get(j)]=true;
                    lis.add(list.get(j));
                    visiteds.add(lis.get(j));
                }

                min=lis.size();
                for(int j=0;j<lis.size()-1;j++){
                    ans[lis.get(j)]=lis.get(j+1);
                }
                //System.out.println(lis.get(lis.size()-1));

                int ss=lis.get(lis.size()-1);
                ans[ss]=1;
            }
            return;
        }
        if(list.size()>=min){
            return;
        }

        vis[src]=true;
        list.add(src);
        if(lin[src].contains(1)){
            dfs(lin,1);
            list.remove(list.size()-1);
            vis[src]=false;
            return;
        }
        for(Integer i:lin[src]){
            if(!vis[i]){
                dfs(lin,i);
            }
        }
        list.remove(list.size()-1);
        vis[src]=false;
    }


    public static void main(String[] args) throws IOException {
        Reader scanner=new Reader();
        int n= scanner.nextInt();
        int m=scanner.nextInt();
        LinkedList<Integer>[] lin=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            lin[j]=new LinkedList<>();
        }
        vis=new boolean[n+1];
        ans=new int[n+1];
        visited=new boolean[n+1];
        visiteds=new ArrayList<>();
        for(int j=0;j<m;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            lin[a].add(b);
            lin[b].add(a);

        }
        Arrays.fill(ans,-1);
        int fs=0;
        list=new ArrayList<>();
        for(int j=n;j>1;j--){
           if(!visited[j] && ans[j]==-1 ){
                vis=new boolean[n+1];
                list=new ArrayList<>();

                min=Integer.MAX_VALUE;
                visiteds=new ArrayList<>();
                dfs(lin,j);
                for(int i=0;i<visiteds.size();i++){
                    visited[visiteds.get(i)]=true;
                }
                if(ans[j]==-1){
                    fs=1;
                    break;
                }
            }
        }
       // StringBuilder stringBuilder=new StringBuilder();
        if(fs==1){
            System.out.println("No");
        }else {
            int ff = 0;
            for (int j = 2; j < ans.length; j++) {
                if (ans[j] == -1) {
                    ff = 1;
                    break;
                }

            }
            if (ff == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                for (int j = 2; j < ans.length; j++) {
                    System.out.println(ans[j]);
                }
            }
        }

    }


    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

}
