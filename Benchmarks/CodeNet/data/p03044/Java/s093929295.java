import java.io.*;
import java.util.*;
public class Main{
	static int[] color;
    static ArrayList<Path>[] pair;
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		pair = new ArrayList[n + 1];
		for (int i = 0; i < n; i++) {
		    pair[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = saori.saori_hayami() - 1;
		    int b = saori.saori_hayami() - 1;
		    int length = saori.saori_hayami();
		    pair[a].add(new Path(b, length));
		    pair[b].add(new Path(a, length));
		}
		color = new int[n + 1];
		Arrays.fill(color, -1);
		dfs(0,0);
		for(int i = 0;i < n;i++){
			System.out.println(color[i]);
		}
	}
	
	static void dfs(int i,int next_color){
		if(color[i] != -1){
			return;
		}
		color[i] = next_color;
		
		for(Path p:pair[i]){
			int a;
			if(p.distance % 2 == 0){
				a = next_color;
			} else {
				a = (1 + next_color) % 2;
			}
			dfs(p.to,a);
		}

		
	}
}

class Path{
	int to;
	int distance;

	public Path(int to,int distance){
		this.to = to;
		this.distance = distance;
	}
}
class hayami implements Closeable {
	private final InputStream in = System.in;
	private final byte[] hayami = new byte[1024];
	private int Hayami = 0;
	private int saori = 0;
	private boolean HayamiSaori() {
		if (Hayami < saori) {
			return true;
		}else{
			Hayami = 0;
			try {
				saori = in.read(hayami);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (saori <= 0) {
				return false;
			}
		}
		return true;
	}
	private int SaoriHayami() { 
		if (HayamiSaori()) {
            return hayami[Hayami++];
         }else{
             return -1;
         }
	}
	private static boolean hayami_saori(int hayami) { 
		return 33 <= hayami && hayami <= 126;
	}
	public boolean hayamisaori() { 
		while(HayamiSaori() && !hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
	}
	public String nextHayami() {
		if (!hayamisaori()) throw new NoSuchElementException();
		StringBuilder hayamin = new StringBuilder();
		int saori = SaoriHayami();
		while(hayami_saori(saori)) {
			hayamin.appendCodePoint(saori);
			saori = SaoriHayami();
		}
		return hayamin.toString();
	}
	public long saorihayami() {//nextLong
		if (!hayamisaori()) throw new NoSuchElementException();
		long hayami = 0;
		boolean misao = false;
		int saori = SaoriHayami();
		if (saori == '-') {
			misao = true;
			saori = SaoriHayami();
		}
		if (saori < '0' || '9' < saori) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= saori && saori <= '9') {
				hayami *= 10;
				hayami += saori - '0';
			}else if(saori == -1 || !hayami_saori(saori)){
				return misao ? -hayami : hayami;
			}else{
				throw new NumberFormatException();
			}
			saori = SaoriHayami();
		}
	}
	public int saori_hayami() {//nextInt
		long hayami = saorihayami();
		if (hayami < Integer.MIN_VALUE || hayami > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) hayami;
	}
	public double Hayamin() { //nextDouble
		return Double.parseDouble(nextHayami());
	}
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
		}
    }
    
}