import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		List<List<Integer>> rer = new ArrayList<>();
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
            rer.add(new ArrayList<>());
		}
		int[] henn = new int[n];
		for(int i = 0;i < n-1;i++){
			int a = saori.saori_hayami() - 1;
			int b = saori.saori_hayami() - 1;
			rer.get(a).add(b);
			henn[i] = b;
		}
		int c = 0;
		int[] color = new int[n];
		

		ArrayDeque<path> q = new ArrayDeque<>();
        q.addLast(new path(0, 0));
        while (!q.isEmpty()) {
            path p = q.poll();
            List<Integer> list = rer.get(p.idx);
            int color2 = 1;
            for (int i : list) {
                if (color2 == p.color) {
                    color2++;
                }
                q.addLast(new path(i, color2));
                color[i] = color2;
                c = Math.max(c, color2);
                color2++;
            }
        }

        System.out.println(c);
        for (int i = 0; i < n-1; i++) {
            System.out.println(color[henn[i]]);
        }

    }
}

class path{
	int color;
	int idx;
	path(int idx, int color) {
		this.idx = idx;
		this.color = color;
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