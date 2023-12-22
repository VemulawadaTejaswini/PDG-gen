import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private final int LEFT = 0, RIGHT = 1, INDEX = 2;

    int[] BIT;

    void update(){

    }

    void add(int i, int x){
        if (i == 0) return;
        while(i < BIT.length){
            BIT[i] += x;
            i += (i & -i);
        }
    }

    int sum(int i){
        int ans = 0;
        while(i > 0){
            ans += BIT[i];
            i -= (i & -i);
        }
        return ans;
    }

    public Main() {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] C = new int[N+1];
        for (int i = 1; i <= N; i++)
            C[i] = scanner.nextInt();

        int[][] queries = new int[Q][3];
        for (int i = 0; i < Q; i++){
            queries[i][LEFT]  = scanner.nextInt();
            queries[i][RIGHT] = scanner.nextInt();
            queries[i][INDEX] = i;
        }

        //right昇順でソート
        Arrays.sort(queries, Comparator.comparingInt(a -> a[RIGHT]));

        int[] Ans = new int[Q];
        int[] CP  = new int[N+1]; //添え字色の最も右に存在する球の場所
        BIT       = new int[N+1];

        HashSet<Integer>         SUM = new HashSet<>(N);
        HashMap<Integer, Integer> DX = new HashMap<>();
        int index = 1;
        for (int [] query : queries){

            while(index <= query[RIGHT]) {
                SUM.add(C[index]);
                DX.put(CP[C[index]], DX.getOrDefault(CP[C[index]],0) - 1);
                DX.put(index,        DX.getOrDefault(index,       0) + 1);
                CP[C[index]] = index;

                index++;
            }

            for (int key : DX.keySet()){
                int num = DX.get(key);
                if(num != 0)
                    add(key, num);
            }
            DX.clear();
            
            Ans[query[INDEX]]
                    = SUM.size() - sum(query[LEFT]-1);
        }

        PrintWriter out;
        out = new PrintWriter(System.out);
        for (int ans : Ans)
            out.println(ans);
        out.flush();
        out.close();
    }

    public static void main(String[] args) {
        new Main();
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
