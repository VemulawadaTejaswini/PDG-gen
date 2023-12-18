import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static char[][] field;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		field = new char[h][w];
		int blackcount = 0;
		
		List<Pair<Integer,Integer>> v = new ArrayList<Pair<Integer,Integer>>();
		List<Pair<Integer,Integer>> tloc = new ArrayList<Pair<Integer,Integer>>();

		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
				if(field[i][j] == '#') {
					blackcount++; 
					v.add(new Pair<Integer,Integer>(i,j));
				}
			}
		}

		int count = 0;
		
		
		if(blackcount == h*w) {
			System.out.println(0);
			return;
		}
		

		loop: while(true) {
			count++;
			for(Pair<Integer, Integer> pair : v){
				int i = pair.getKey();
				int j = pair.getValue();
				if(field[i][j] == '#'){
					try{
						if(field[i + 1][j] == '.'){
							field[i + 1][j] = 't';
							blackcount++;
							tloc.add(new Pair<Integer,Integer>(i+1,j));
						}
					}catch (Exception e){

					}
					try{
						if(field[i - 1][j] == '.'){
							field[i - 1][j] = 't';
							blackcount++;
							tloc.add(new Pair<Integer,Integer>(i-1,j));
						}
					}catch (Exception e){

					}
					try{
						if(field[i][j - 1] == '.'){
							field[i][j - 1] = 't';
							blackcount++;
							tloc.add(new Pair<Integer,Integer>(i,j-1));
						}
					}catch (Exception e){

					}
					try{
						if(field[i][j + 1] == '.'){
							field[i][j + 1] = 't';
							blackcount++;
							tloc.add(new Pair<Integer,Integer>(i,j+1));
						}
					}catch (Exception e){

					}

				}
			}

			v.clear();
			
			for(Pair<Integer,Integer> pair : tloc) {
				field[pair.getKey()][pair.getValue()] = '#';
				v.add(pair);
			}
			
			tloc.clear();
			
			if(blackcount == h*w) break loop;

		}
		System.out.println(count);
	}
}
class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
    }
 }
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