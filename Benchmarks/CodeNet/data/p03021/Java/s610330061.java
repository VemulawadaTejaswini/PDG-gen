import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static int maxdepth = 0;
    static int maxidx1 = 0;
    static int maxidx2 = 0;
    static int tmptesuu = 0;

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	char[] S = sc.next().toCharArray();
    	V = new Node[n];
    	for(int i=0; i<n; i++) {
    		V[i] = new Node();
    		V[i].idx = i;
    		if(S[i] == '1') V[i].mark = 1;
    	}
    	for(int i=0; i<n-1; i++) {
    		int a = sc.nextInt() - 1;
    		int b = sc.nextInt() - 1;
    		V[a].nbr.add(b);
    		V[b].nbr.add(a);
    	}
    	V[0].dfs(0);
    	maxdepth = 0;
    	maxidx2 = maxidx1;
    	for(int i=0; i<n; i++) {
    		V[i].vst = false;
    	}

    	V[maxidx1].dfs(0);
    	for(int i=0; i<n; i++) {
    		V[i].vst = false;
    	}

    	V[maxidx1].putLongestPath(0);
    	for(int i=0; i<n; i++) {
    		V[i].vst = false;
    	}

    	V[maxidx1].dfs2();
    	for(int i=0; i<n; i++) {
    		V[i].vst = false;
    	}

		long ans = Long.MAX_VALUE;
    	for(int i=0; i<n; i++) {
    		if(V[i].longestpathorder == -1) continue;
    		int d = V[i].longestpathorder;
    		long tesuu1 = 0;
    		long tesuu2 = 0;
    		for(int j=0; j<n; j++) {
    			if(j == i) continue;
    			if(V[j].longestpathorder == -1) continue;
    			if(V[j].longestpathorder < d) {
    				tesuu1 += V[j].tesuu;
    				tesuu1 += V[j].mark * (d - V[j].longestpathorder);
    			} else {
    				tesuu2 += V[j].tesuu;
    				tesuu2 += V[j].mark * (V[j].longestpathorder - d);
    			}
    		}

    		if(Math.abs(tesuu1 - tesuu2) <= V[i].tesuu && tesuu1 + tesuu2 >= V[i].tesuu) {
    			if((tesuu1 + tesuu2 + V[i].tesuu) % 2 == 0) {
    				if((tesuu1 + tesuu2 + V[i].tesuu) / 2 < ans) {
    					ans = (tesuu1 + tesuu2 + V[i].tesuu) / 2;
    				}
    			}
    		}
    	}

    	if(ans == Long.MAX_VALUE) {
    		System.out.println(-1);
    	} else {
    		System.out.println(ans);
    	}
    }

    static class Node {
    	int idx;
        HashSet<Integer> nbr = new HashSet<>();
        boolean vst = false;
        int longestpathorder = -1;
        int mark = 0;
        int tesuu = 0;
        void dfs(int depth) {
        	vst = true;
        	if(depth > maxdepth) {
        		maxdepth = depth;
        		maxidx1 = idx;
        	}
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			V[x].dfs(depth+1);
        		}
        	}
        }
        int putLongestPath(int depth) {
        	vst = true;
        	if(idx == maxidx2) {
        		longestpathorder = depth;
        	}
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			int order = V[x].putLongestPath(depth+1);
        			if(order >= 0) {
        				longestpathorder = order;
                	}
        		}
        	}
        	return longestpathorder - 1;
        }

        void dfs2() {
        	vst = true;
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			if(V[x].longestpathorder >= 0) {
        				V[x].dfs2();
        			} else {
        				int tmp = V[x].addTesuu(1);
        				mark += tmp;
        				tesuu = tmptesuu;
        				tmptesuu = 0;
        			}
        		}
        	}
        }

        int addTesuu(int depth) {
        	vst = true;
        	int marksum = mark;
        	if(mark == 1) {
        		tmptesuu += depth;
        	}
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			if(V[x].longestpathorder == -1) {
        				int tmp = V[x].addTesuu(depth+1);
        				marksum += tmp;
        			}
        		}
        	}
        	return marksum;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
