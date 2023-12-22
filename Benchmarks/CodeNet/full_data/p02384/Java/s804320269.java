import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		int[] a = new int[6];
		for(int i = 0; i < 6; ++i)
			a[i] = sc.nextInt();
		Dice d = new Dice(a);
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i){
			int ans = 0;
			int top = sc.nextInt();
			int fr = sc.nextInt();
			if(top == d.Front) d.turnN();
			else if(top == d.Right) d.turnW();
			else if(top == d.Left) d.turnE();
			else if(top == d.Back) d.turnS();
			else if(top == d.Bottom) {d.turnN(); d.turnN();}
			
			if(fr == d.Front) ans = d.Right;
			else if(fr == d.Right) ans = d.Back;
			else if(fr == d.Back) ans = d.Left;
			else if(fr == d.Left) ans = d.Front;
			System.out.println(ans);
		}
	}

}

class Dice{
	int Top, Front, Right, Left, Back, Bottom;
	Dice(int[] a){
		Top = a[0]; Front = a[1]; Right = a[2];
		Left = a[3]; Back = a[4]; Bottom = a[5];
	}
	void turnN(){
		int tmp = Top; Top = Front; Front = Bottom;
		Bottom = Back; Back = tmp;
	}
	void turnS(){
		int tmp = Top; Top = Back; Back = Bottom;
		Bottom = Front; Front = tmp;
	}
	void turnE(){
		int tmp = Top; Top = Left; Left = Bottom;
		Bottom = Right; Right = tmp;
	}
	void turnW(){
		int tmp = Top; Top = Right; Right = Bottom;
		Bottom = Left; Left = tmp;
	}
}

class NScanner{

	private BufferedReader br;
	private StringTokenizer tok;

	public NScanner(InputStream is) throws IOException{
		br = new BufferedReader(new InputStreamReader(is));
		getLine();
	}

	private void getLine() throws IOException{
		while(tok == null || !hasNext()){
			tok = new StringTokenizer(br.readLine());
		}
	}

	public boolean hasNext(){
		return tok.hasMoreTokens();
	}

	public String next() throws IOException{
		if(hasNext()){
			return tok.nextToken();
		}else{
			getLine();
			return tok.nextToken();
		}
	}

	public int nextInt() throws IOException{
		if(hasNext()){
			return Integer.parseInt(tok.nextToken());
		}else{
			getLine();
			return Integer.parseInt(tok.nextToken());
		}
	}

	public long nextLong() throws IOException{
		if(hasNext()){
			return Long.parseLong(tok.nextToken());
		}else{
			getLine();
			return Long.parseLong(tok.nextToken());
		}
	}

	public double nextDouble() throws IOException{
		if(hasNext()){
			return Double.parseDouble(tok.nextToken());
		}else{
			getLine();
			return Double.parseDouble(tok.nextToken());
		}
	}
}
