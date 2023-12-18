	import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
	
	/**
	 * Built using CHelper plug-in
	 * Actual solution is at the top
	 */
	public class Main {
	    public static void main(String[] args) {
	        InputStream inputStream = System.in;
	        OutputStream outputStream = System.out;
	        InputReader in = new InputReader(inputStream);
	        PrintWriter out = new PrintWriter(outputStream);
	        TaskE solver = new TaskE();
	        solver.solve(1, in, out);
	        out.close();
	    }
	
	    static class TaskE {
	        static final long MODULO = (long) 1e9 + 7;
	        int n;
	        int[] a;
	        int[] w;
	
	        int[] mul(int[] a, int[] b) {
	            int[] c = new int[9];
	            for (int i = 0; i < 3; ++i) {
	                for (int j = 0; j < 3; ++j) {
	                    long s = 0;
	                    for (int k = 0; k < 3; ++k) s += a[(i) * 3 + k] * (long) b[(k) * 3 + j];
	                    c[(i) * 3 + j] = (int) (s % MODULO);
	                }
	            }
	            return c;
	        }
	
	        int[] add(int[] a, int[] b) {
	            int[] c = new int[9];
	            for (int i = 0; i < 3; ++i) {
	                for (int j = 0; j < 3; ++j) {
	                    long s = a[(i) * 3 + j] + b[(i) * 3 + j];
	                    c[(i) * 3 + j] = (int) (s % MODULO);
	                }
	            }
	            return c;
	        }
	
	        public void solve(int testNumber, InputReader in, PrintWriter out) {
	            n = in.nextInt();
	            a = new int[n];
	            for (int i = 0; i < n; ++i) a[i] = in.nextInt();
	            for (int i = 0, j = n - 1; i < j; ++i, --j) {
	                int t = a[i];
	                a[i] = a[j];
	                a[j] = t;
	            }
	            int[] positions = new int[n];
	            for (int i = 0; i < n; ++i) positions[i] = i;
	            w = getW(a.clone());
	            for (int x : w)
	                if (x == 0) {
	                    out.println(0);
	                    return;
	                }
	
	            TaskE.Description desc = doit(0, n - 1, positions);
	            out.println(desc.inside[(2) * 3 + 0]);
	        }
	
	        private int[] getW(int[] a) {
	            Arrays.sort(a);
	            int sofar = 0;
	            int pos = a.length - 1;
	            int[] w = new int[n];
	            for (int i = n - 1; i >= 0; --i) {
	                while (pos >= 0 && a[pos] == i + 1) {
	                    ++sofar;
	                    --pos;
	                }
	                w[i] = Math.max(0, sofar);
	                --sofar;
	            }
	            return w;
	        }
	        
	        int gcRun = 0;
	
	        private TaskE.Description doit(int min, int max, int[] positions) {
	            TaskE.Description res = new TaskE.Description();
	            if (min == max) {
	                res.p00then01 = new int[positions.length][];
	                res.p00then10 = new int[positions.length][];
	                res.p01then11 = new int[positions.length][];
	                res.p10then11 = new int[positions.length][];
	                int k = min;
	                for (int x : positions) if (a[x] != k + 1) throw new RuntimeException();
	                res.p00 = new int[9];
	                res.p00[(0) * 3 + 0] = w[k];
	                res.p01 = new int[9];
	                res.p01[(0) * 3 + 0] = w[k] - 1;
	                res.p01[(1) * 3 + 0] = 1;
	                res.p01[(1) * 3 + 1] = w[k];
	                res.p10 = new int[9];
	                res.p10[(0) * 3 + 0] = w[k] - 1;
	                res.p11 = new int[9];
	                res.p11[(0) * 3 + 0] = Math.max(0, w[k] - 2);
	                res.p11[(1) * 3 + 0] = 1;
	                res.p11[(1) * 3 + 1] = w[k] - 1;
	                res.p11[(2) * 3 + 1] = 1;
	                res.p11[(2) * 3 + 2] = w[k];
	                for (int i = 0; i < positions.length; ++i) {
	                    res.p01then11[i] = res.p11;
	                    res.p10then11[i] = res.p11;
	                    res.p00then10[i] = res.p10;
	                    res.p00then01[i] = res.p01;
	                }
	                int[] sum = new int[9];
	                res.inside = new int[9];
	                for (int x : positions) {
	                    res.inside = add(res.inside, sum);
	                    sum = add(sum, res.p11);
	                }
	            } else {
	                int mid = (min + max) / 2;
	                int numBottom = 0;
	                int numTop = 0;
	                for (int x : positions)
	                    if (a[x] <= mid + 1) {
	                        ++numBottom;
	                    } else {
	                        ++numTop;
	                    }
	                int[] bottomPositions = new int[numBottom];
	                int[] topPositions = new int[numTop];
	                numBottom = 0;
	                numTop = 0;
	                for (int x : positions)
	                    if (a[x] <= mid + 1) {
	                        bottomPositions[numBottom++] = x;
	                    } else {
	                        topPositions[numTop++] = x;
	                    }
	                TaskE.Description bottom;
	                TaskE.Description top;
	                if (numBottom < numTop) {
	                    bottom = doit(min, mid, bottomPositions);
	                    top = doit(mid + 1, max, topPositions);
	                } else {
	                    top = doit(mid + 1, max, topPositions);
	                    bottom = doit(min, mid, bottomPositions);
	                }
	                if (((++gcRun) & 255) == 0)
	                System.gc();
	                res.p00then01 = new int[positions.length][];
	                res.p00then10 = new int[positions.length][];
	                res.p01then11 = new int[positions.length][];
	                res.p10then11 = new int[positions.length][];
	                res.inside = add(mul(bottom.inside, top.p00), mul(bottom.p11, top.inside));
	                res.p00 = mul(bottom.p00, top.p00);
	                res.p11 = mul(bottom.p11, top.p11);
	                res.p01 = mul(bottom.p01, top.p01);
	                res.p10 = mul(bottom.p10, top.p10);
	                int topPtr = 0;
	                int bottomPtr = 0;
	                int[] topSum = new int[9];
	                int[] bottomSum = new int[9];
	                int ptr = 0;
	                for (int x : positions)
	                    if (a[x] <= mid + 1) {
	                        res.p00then01[ptr] = mul(bottom.p00then01[bottomPtr], top.p00);
	                        res.p00then10[ptr] = mul(bottom.p00then10[bottomPtr], top.p00);
	                        res.p10then11[ptr] = mul(bottom.p10then11[bottomPtr], top.p10);
	                        res.p01then11[ptr] = mul(bottom.p01then11[bottomPtr], top.p01);
	                        res.inside = add(res.inside, mul(bottom.p10then11[bottomPtr], topSum));
	                        bottomSum = add(bottomSum, bottom.p01then11[bottomPtr]);
	                        ++bottomPtr;
	                        ++ptr;
	                    } else {
	                        res.p00then01[ptr] = mul(bottom.p01, top.p00then01[topPtr]);
	                        res.p00then10[ptr] = mul(bottom.p10, top.p00then10[topPtr]);
	                        res.p10then11[ptr] = mul(bottom.p11, top.p10then11[topPtr]);
	                        res.p01then11[ptr] = mul(bottom.p11, top.p01then11[topPtr]);
	                        res.inside = add(res.inside, mul(bottomSum, top.p00then01[topPtr]));
	                        topSum = add(topSum, top.p00then10[topPtr]);
	                        ++topPtr;
	                        ++ptr;
	                    }
	            }
	            return res;
	        }
	
	        static class Description {
	            int[] inside;
	            int[] p00;
	            int[] p11;
	            int[] p01;
	            int[] p10;
	            public int[][] p10then11;
	            public int[][] p01then11;
	            public int[][] p00then01;
	            public int[][] p00then10;
	
	        }
	
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
	
