
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        RAQ lazysegTreemin = new RAQ(N);
        ArrayList<Pair2> arrayList=new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			int z=sc.nextInt();
			arrayList.add(new Pair2(x, y, z));
		}
		Collections.sort(arrayList);
		int c=0;
		for (int i = 0; i < N; i++) {
			long sum=0;
			long max=-lazysegTreemin.min(0, i);
			if (i==0) {
				max=0;
			}
			while (c<M) {
				if (arrayList.get(c).y!=i) {
					break;
				}
				int l=arrayList.get(c).x;
				long w=(long)arrayList.get(c).z;
				sum+=w;
				if (l<i) {
					lazysegTreemin.add(l, i, -w);
				}	
				c++;
			}
			lazysegTreemin.add(i, i+1, -max-sum);
		}
		System.out.println(Math.max(0, -lazysegTreemin.min(0, N)));
    }
    static class Pair2 implements Comparable<Pair2>{
    	public int x;
    	public int y;
    	public int z;
    	public Pair2(int x,int y,int z) {
    		this.x=x;
    		this.y=y;
    		this.z=z;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair2) {
    			Pair2 other = (Pair2) obj;
    			return other.x==this.x && other.y==this.y&& other.z==this.z;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y,this.z);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair2 p2 ){
    		if (this.y>p2.y) {
    			return 1;
    		}
    		else if (this.y<p2.y) {
    			return -1;
    		}
    		else {
    			return 0;
    		}
    	}
    }
    static class RAQ {
        int n;
        long[] sum, min, max, lazy;
        int[] mini, maxi;

        RAQ(int size) {
            n = 1;
            while (n < size) n *= 2;
            sum = new long[2 * n - 1];
            min = new long[2 * n - 1];
            max = new long[2 * n - 1];
            lazy = new long[2 * n - 1];
            mini = new int[2 * n - 1];
            maxi = new int[2 * n - 1];
            Arrays.fill(min, Long.MAX_VALUE);
            Arrays.fill(max, Long.MIN_VALUE);
            for (int i = 0; i < n; i++) {
                mini[i + n - 1] = i;
                maxi[i + n - 1] = i;
            }
            for (int i = 0; i < size; i++) {
                update(i, 0);
            }
        }

        RAQ(int[] a) {
            this(a.length);
            for (int i = 0; i < a.length; i++) {
                update(i, a[i]);
            }
        }

        public void update(int i, int x) {
            i += n - 1;
            sum[i] = x;
            min[i] = x;
            max[i] = x;
            while (i > 0) {
                i = (i - 1) / 2;
                sum[i] = sum[i * 2 + 1] + sum[i * 2 + 2];
                setMinMax(i);
            }
        }

        public void add(int l, int r, long x) {
            add(l, r, 0, x, 0, n);
        }

        public void add(int a, int b, int k, long x, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return;
            else if (a <= l && r <= b) {
                lazy[k] += x;
                eval(k, l, r);
            } else {
                add(a, b, k * 2 + 1, x, l, (l + r) / 2);
                add(a, b, k * 2 + 2, x, (l + r) / 2, r);
                sum[k] = sum[k * 2 + 1] + sum[k * 2 + 2];
                setMinMax(k);
            }
        }

        public long sum(int l, int r) {
            return sum(l, r, 0, 0, n);
        }

        public long sum(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return sum[k];
            } else {
                long lv = sum(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = sum(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv + rv;
            }
        }

        public long min(int l, int r) {
            return min(l, r, 0, 0, n);
        }

        public long min(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return Integer.MAX_VALUE;
            else if (a <= l && r <= b) {
                return min[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(lv, rv);
            }
        }

        public long mini(int l, int r) {
            return mini(l, r, 0, 0, n);
        }

        public long mini(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return mini[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = mini(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = mini(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv < rv ? li : ri;
            }
        }

        public long max(int l, int r) {
            return max(l, r, 0, 0, n);
        }

        public long max(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return Integer.MIN_VALUE;
            else if (a <= l && r <= b) {
                return max[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.max(lv, rv);
            }
        }

        public long maxi(int l, int r) {
            return maxi(l, r, 0, 0, n);
        }

        public long maxi(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return maxi[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = maxi(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = maxi(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv > rv ? li : ri;
            }
        }


        private void eval(int k, int l, int r) {
            if (lazy[k] != 0) {
                sum[k] += lazy[k] * (r - l);
                min[k] += lazy[k];
                max[k] += lazy[k];
                if (r - l > 1) {
                    lazy[k * 2 + 1] += lazy[k];
                    lazy[k * 2 + 2] += lazy[k];
                }
                lazy[k] = 0;
            }
        }

        private void setMinMax(int i) {
            if (min[i * 2 + 1] < min[i * 2 + 2]) {
                min[i] = min[i * 2 + 1];
                mini[i] = mini[i * 2 + 1];
            } else {
                min[i] = min[i * 2 + 2];
                mini[i] = mini[i * 2 + 2];
            }
            if (max[i * 2 + 1] > max[i * 2 + 2]) {
                max[i] = max[i * 2 + 1];
                maxi[i] = maxi[i * 2 + 1];
            } else {
                max[i] = max[i * 2 + 2];
                maxi[i] = maxi[i * 2 + 2];
            }
        }

    }

}

