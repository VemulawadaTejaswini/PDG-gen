import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
    //WRWWRWRR     wwwrrrrwwwwrrr
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();
        char[][] cs = new char[h][];
        for(int i=0;i<h;i++){
            cs[i] = in.next().toCharArray();
        }
        int tot = 1<<(h-1);
        //int[] arr = new int[tot+1];
        //Arrays.fill(arr,Integer.MAX_VALUE/2);
        int ans = Integer.MAX_VALUE/2;
        for(int i=0;i<=tot;i++){
            List<Integer> get = new ArrayList<>();
            for(int j=0;j<h;j++){
                if((i|(1<<j))==i) get.add(j);
            }
            int sz = get.size();
            if(get.size()==0||get.get(get.size()-1)!=h-1) get.add(h-1);
            //out.println(get+" "+i);
            int res = 0;
            boolean bk = true;
            boolean[] arr = new boolean[w+1];
            int[] aka = new int[sz+1];
            for(int j=0;j<w&&bk;j++){
                int[] rn = new int[sz+1];
                for(int p=0;p<get.size()&&bk;p++){
                    int bf = p==0?0:get.get(p-1)+1;
                    int cnt = 0;
                    for(int v = bf; v <= get.get(p); v++ ){
                        if(cs[v][j]=='1'){
                            cnt++;
                        }
                    }
                    rn[p] = cnt;
                    if(cnt>k){
                        bk = false;
                        break;
                    }
                }
                boolean find = false;
                for(int s=0;s<sz+1;s++){
                    if(rn[s]+aka[s]>k){
                        res++;
                        find = true;
                        break;
                    }
                }
                //out.println(Arrays.toString(aka));
                if(find){
                    aka = rn;
                }else{
                    for(int s=0;s<sz+1;s++){
                        aka[s]+=rn[s];
                    }
                }
            }
            if(bk){
                //out.println(i+" "+Integer.bitCount(i)+res);
                ans = Math.min(ans,Integer.bitCount(i)+res);
            }
        }
        out.println(ans);
    }

    //	public static void main(String[] args){
//		Scanner scanner = new Scanner(new InputStreamReader(System.in));
//		int n  = Integer.parseInt(scanner.nextLine());
//		String s = scanner.nextLine();
//		LinkedList<Integer> q = new LinkedList<>();
//		for(int i=0;i<n;i++){
//			if(s.charAt(i)=='W'){
//				q.add(i);
//			}
//		}
//		int res = 0;
//		for(int i=n-1;i>=0;i--){
//			if(q.size()==0) break;
//			if(s.charAt(i)=='R'){
//				int v = q.poll();
//				if(v>i) break;
//				res++;
//			}
//		}
//		System.out.println(res);
//
//	}
    public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main solver = new Main();
//        int num = in.nextInt();
//        while(num-->0){
//            solver.solve(1, in, out);
//        }
        solver.solve(1, in, out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}