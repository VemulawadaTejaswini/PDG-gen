import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        ArrayList<Integer> ori = new ArrayList<Integer>();
        HashMap<Long, Long> hashmap = new HashMap<Long, Long>();//[1]

        for(int i=0; i<n; i++){
        	ori.add(sc.nextInt());
        }

        long tk=0;
        long r =0;

        for(int l=0; l<ori.size(); l++){
        	for(int j=l+1; j<ori.size(); j++){

        		long ll = ori.get(l);
        		long il = ori.get(j);
        		r = ll*il;

        		//System.out.println(l+";" +ori.get(l) +","+j +";" + ori.get(j) + " = " + r);

        		hashmap.put(tk, r);
		        tk+=1;
		    }
        }

        //Collections.sort(re);
        List<Entry<Long, Long>> list_entries = new ArrayList<Entry<Long, Long>>(hashmap.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<Long, Long>>() {
            public int compare(Entry<Long, Long> obj1, Entry<Long, Long> obj2) {
                // 4. 昇順
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        tk=0;

        //System.out.println(list_entries);
        for(Entry<Long, Long> entry : list_entries) {
        	tk+=1;
            if(tk == k) {
            	System.out.println(entry.getValue());
            }
        }
    }
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
