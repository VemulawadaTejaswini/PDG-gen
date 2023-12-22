import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int k = sc.nextInt();
			int a = sc.nextInt();
			int h = sc.nextInt();
			if(n+m+l+k+a+h == 0) break;
			
			int inf = 1 << 28;
			int[][] g = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					g[i][j] = inf;
				}
			}
			
			boolean[] canFreeze = new boolean[n];
			canFreeze[a] = true;
			canFreeze[h] = true;
			for (int i = 0; i < l; i++) {
				canFreeze[sc.nextInt()] = true;
			}
			
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int t = sc.nextInt();
				g[x][y] = t;
				g[y][x] = t;
			}
			
			// ワーシャルフロイドする
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int t = 0; t < n; t++) {
						g[i][j] = Math.min(g[i][j], g[i][t] + g[t][j]);
					}
				}
			}
			
			// 凍らせられない街のみにする
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(!canFreeze[i] || !canFreeze[j]){
						g[i][j] = inf;
					}
				}
			}
			
			// 届かないエッジを除く
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(g[i][j] > m){
						g[i][j] = inf;
					}
				}
			}
			
			// この状態でもう一回ワーシャルフロイド
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int t = 0; t < n; t++) {
						g[i][j] = Math.min(g[i][j], g[i][t] + g[t][j]);
					}
				}
			}
			
			if(g[a][h] >= inf){
				System.out.println("Help!");
			}else{
				System.out.println(g[a][h] * 2 - m);
			}
		}
		sc.close();
	}
}

/**
 * 複素数
 */
class Complex {
	static Complex I = new Complex(0, 1);
	
	double r = 0.0;
	double i = 0.0;
	Complex(double r, double i){
		this.r = r;
		this.i = i;
	}
	public Complex plus(Complex a){
		return new Complex(r * a.r, i + a.i);
	}

	@Override
	public String toString(){
		return r + "+" + i + "i";
	}
}




// --- ここから下はライブラリ ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil {
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){
		return Integer.parseInt(o.toString());
	}
}