import java.io.*;
import java.util.*;

class Main{
    final static long INF = Long.MAX_VALUE / 2;
    final static int MOD = 1_000_000_007;
    final static int SIZE = 1_000_000;
    long[] fac = new long[SIZE];
    long[] inv = new long[SIZE];
    long[] finv = new long[SIZE];
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    int n;
    List<ArrayList<Integer>> m;
    int[] parent;
    int[] depth;
    boolean[] ok;
    boolean[] used;
    List<ArrayList<Integer>> position;
    List<Pair> task;
    List<Pair> num;
    int[] answer;

    void solve(){

        n = sc.nextInt();
        m = new ArrayList<>();
        parent = new int[n];
        depth = new int[n];
        ok = new boolean[n];
        used = new boolean[n + 1];
        position = new ArrayList<>();
        task = new ArrayList<>();
        num = new ArrayList<>();
        answer = new int[n];
        Arrays.fill(answer, -1);

        for(int i = 0; i < n; i++){
            m.add(new ArrayList<>());
            position.add(new ArrayList<>());
            num.add(new Pair(i, 0));
        }

        for(int i = 0; i < n - 1; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            m.get(a).add(b);
            m.get(b).add(a);
        }

        dfs(0, 0, 0);

        // System.out.println("-----");

        for(int i = 0; i < n; i++){
            search(i);
        }

        Collections.sort(num, Collections.reverseOrder());

        // for(int i = 0; i < n; i++){
        //     System.out.println(num.get(i).a + " " + num.get(i).b);
        // }

        int x = 0;
        for(int i = 1; i <= n / 3; i++){
            answer[num.get(x).a] = i * 3;
            ok[num.get(x).a] = true;
            used[i * 3] = true;
            x++;
        }

        for(Pair p : task){
            if(ok[p.a] || ok[p.b]) continue;
            int y = 1;
            while(!used[y] && y + 1 < n && !used[y + 1]){
                answer[p.a] = y;
                answer[p.b] = y + 1;
                used[y] = true;
                used[y + 1] = true;
                y += 3;
            }
        }

        int z = 1;
        for(int i = 0; i < n; i++){
            if(answer[i] == -1){
                while(used[z]){
                    z++;
                }
                answer[i] = z;
                used[z] = true;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(answer[i] + " ");
        }

        System.out.println();

    }

    void search(int v){
        if(depth[v] >= n - 1) return;
        for(int i : position.get(depth[v] + 1)){
            if(distance(v, i) == 3){
                //System.out.println(v + " " + i);
                task.add(new Pair(v, i));
                num.get(v).b++;
                num.get(i).b++;
            }
        }
        if(depth[v] >= n - 3) return;
        for(int i : position.get(depth[v] + 3)){
            if(distance(v, i) == 3){
                //System.out.println(v + " " + i);
                task.add(new Pair(v, i));
                num.get(v).b++;
                num.get(i).b++;
            }
        }
    }

    int distance(int a, int b){
        return depth[a] + depth[b] - 2 * depth[lca(a, b)];
    }

    void dfs(int v, int p, int d){
        parent[v] = p;
        depth[v] = d;
        position.get(d).add(v);
        for(int i : m.get(v)){
            if(i != p) dfs(i, v, d + 1);
        }
    }

    int lca(int a, int b){
        while(a != b){
            if(depth[a] < depth[b]){
                b = parent[b];
            }else{
                a = parent[a];
            }
        }

        return a;
    }

    long gcd(long a, long b){ // return aとbの最大公約数
        if(b == 0){
          return a;
        }
        return gcd(b, a % b);
    }

    long lcm(long a, long b){ // return aとbの最小公倍数
        return a * b / gcd(a, b);
    }

    long inv(long a){ // return aの逆元 (mod MOD)
        return pow(a, MOD - 2);
    }

    long pow(long a, long r){ // return a^r (mod MOD)
        long sum = 1;
        while(r > 0){
            if((r & 1) == 1){ // 2進数表記で末尾1の時
                sum *= a;
                sum %= MOD;
            }
            a *= a;
            a %= MOD;
            r >>= 1;
        }
        return sum;
    }

    long modFact(long n){ // retur n! (mod MOD)
        if(n == 0){
            return 1;
        }
        return n * modFact(n - 1) % MOD;
    }

    long fact(long n){ // return n!
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }

    void initCOMB(){
        fac[0] = fac[1] = 1;
        inv[1] = 1;
        finv[0] = finv[1] = 1;
        for(int i = 2; i < SIZE; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    long modComb(int n, int r){ // return nCr (先にinitCOMB()必要)
        if(n < r || n < 0 || r < 0) return 0;
        return fac[n] * finv[r] % MOD * finv[n - r] % MOD;
    }

    long comb(long n, long r){ // return nCr
        long num = 1;
        for(long i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }

    boolean isPrime(long a){ // aの素数判定
        if(a <= 1) return false;
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }

    String nextPermutation(String s){ // return sの次の順列
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) list.add(s.charAt(i));

        int pivotPos = -1;
        char pivot = 0;
        for(int i = list.size() - 2; i >= 0; i--){
            if(list.get(i) < list.get(i+1)){
    			pivotPos = i;
    			pivot = list.get(i);
    			break;
    		}
    	}

        if(pivotPos == -1 && pivot == 0) return null;

        int L = pivotPos + 1;
        int R = list.size() - 1;
    	int minPos = -1;
    	char min = Character.MAX_VALUE;
    	for(int i = R; i >= L; i--){
    		if(pivot < list.get(i)){
    			if(list.get(i) < min){
    				min = list.get(i);
    				minPos = i;
    			}
    		}
    	}

    	Collections.swap(list, pivotPos, minPos);
    	Collections.sort(list.subList(L, R + 1));

    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<list.size(); i++) sb.append(list.get(i));

    	return sb.toString();
    }

    boolean nextPermutation(long[] a){
        for(int i = a.length - 1; i > 0; i--){
            if(a[i - 1] < a[i]){
                int swapIndex = find(a[i - 1], a, i, a.length - 1);
                long temp = a[swapIndex];
                a[swapIndex] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, a.length);
                return true;
            }
        }
        return false;
    }

    int find(long dest, long[] a, int s, int e){
        if(s == e){
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }

    void elimination(int[][] a, int[] b) {
        int n = a.length;
        double f;
        for(int k = 0; k < n - 1; k++){
            for(int i = k + 1; i < n; i++){
                f = - a[i][k] / a[k][k];
                for(int j = k + 1; j < n; j++){
                    a[i][j] += f * a[k][j];
                }
                b[i] += f * b[k];
            }
            for(int i = n - 1; i >= 0; i--){
                for(int j = i + 1; j < n; j++){
                    b[i] -= a[i][j] * b[j];
                }
                b[i] = b[i] / a[i][i];
            }
        }
   }

}



class Pair implements Comparable<Pair>{
    int a, b;
    public Pair(int i, int j){
        a = i;
        b = j;
    }

    @Override
    public int compareTo(Pair p){
        if(this.b < p.b) return -1;
        else if(this.b > p.b) return 1;
        else return 0;
    }
}



class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <= 0){
                return false;
            }
        }
        return true;
    }
    private int readByte(){
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c){
        return 33 <= c && c <= 126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b <= '9'){
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
    public int nextInt(){
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}
