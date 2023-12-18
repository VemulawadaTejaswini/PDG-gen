import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		String[] s = new String[n];
		int count = 1;
		int savecount = 0;
		int stercount = 0;
		for(int i = 0; i < s.length; i++) {
			s[i] = saori.nextHayami();
		}
		String[] scopy = test1(s);
		Arrays.sort(s);
		String[][] str = new String[n+1][scopy.length];

		for(int i = 0; i < s.length-1;i++){
			if(s[i].equals(s[i+1])){
				count++;
				if(i == s.length -2){
					str[count][stercount] = s[i];
					if(count >= savecount){
						savecount = count;
					}
				}
			} else {
				str[count][stercount] = s[i];
				if(count >= savecount){
					savecount = count;
				}
				if(i == s.length -2){
					str[1][stercount+1] = s[i+1];
					if(count >= savecount){
						savecount = count;
					}
				}
				count = 1;
				stercount++;
			}
		}
		for(int i = 0; i < scopy.length;i++){
			if(str[savecount][i] != null){
				System.out.println(str[savecount][i]);
			}
		}

	}
	
	private static String[] test1(String[] arrys) {

        List<String> list = new ArrayList<String>();
        for (String arry : arrys) {
            if (!list.contains(arry)) {
                list.add(arry);
            }
        }

        String[] newstr = new String[list.size()];
        for (int i = 0; i < newstr.length; i++) {
            newstr[i] = list.get(i);
        }

        return newstr;
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