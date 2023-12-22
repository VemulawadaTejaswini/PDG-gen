import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	String s;
	String rank= "23456789TJQKA";
	
	public int compare(String a,String b,String s,String l){
		
		int ai = a.indexOf(s);
		int bi = b.indexOf(s);
		
		if((ai == -1 && bi == -1) || (ai != -1 && bi != -1)){
			if(ai == -1 && bi == -1){
				int aj = a.indexOf(l);
				int bj = b.indexOf(l);
				if((aj == -1 && bj == -1) || (aj != -1 && bj != -1)){
					return rank.indexOf(a.substring(0,1)) - rank.indexOf(b.substring(0,1));
				}else if(aj != -1 && bj == -1){
					return 1;
				}else if(aj == -1 && bj != -1){
					return -1;
				}else{
					return 0;
				}
			}
			return rank.indexOf(a.substring(0,1)) - rank.indexOf(b.substring(0,1));
		}else if(ai != -1 && bi == -1){
			return 1;
		}else if(ai == -1 && bi != -1){
			return -1;
		}else{
			return 0;
		}
	}
	public void solve(){
		while(true){
			s = next();
			if(s.equals("#"))break;
			
			int ns = 0;
			int ew = 0;
			String[][] cards = new String[4][13];
			for(int i = 0;i < 4;i++){
				for(int j = 0;j < 13;j++){
					cards[i][j] = next();
				}
			}
			int lead = 0;
			for(int i = 0;i < 13;i++){
				int max = 0;
				for(int j = 0;j < 4;j++){
					int res = compare(cards[max][i],cards[j][i],s,cards[lead][i].substring(1,2));
					if(res < 0){
						max = j;
					}
				}
				if(max == 0 || max == 2){
					ns++;
				}else{
					ew++;
				}
				lead = max;
			}
			if(ns < ew){
				out.println("EW " + (ew - 6));
			}else{
				out.println("NS " + (ns - 6));
			}
		}
	}
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
 
	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}
 
	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}
 
	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}
 
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt() {
		return Integer.parseInt(next());
	}
 
	public long nextLong() {
		return Long.parseLong(next());
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}