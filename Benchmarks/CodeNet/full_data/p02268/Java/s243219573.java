import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader br;
		if( args.length > 0 && args[0].equals("File") == true ) {
			br = getReader("C:\\Users\\USER\\Downloads\\ALDS1_4_A-in8.txt");
		} else {
			br = getReader();
		}
		int snum = getInt(br);
		int[] snumAry = getIntAry(br);
		int tnum = getInt(br);
		int[] tnumAry = getIntAry(br);
		int count = 0;
		for( int t = 0; t < tnumAry.length ; t++ ) {
			if ( member(tnumAry[t], snumAry) == true ) {
				slist(tnumAry[t]);
//				break;
			}
		}
		count = list.size();
//		System.out.println("");
		System.out.println(count);
	}
	public static boolean member( int t, int[] num ) {
		int i = 0;
		int j = num.length-1;
		int k = i + (j-i)/2 ;
		while(i<=j) {
			if (t == num[k]) {
				return true;
			} else if ( t > num[k]) {
				i = k+1;
			} else {
				j = k-1;
			}
			k = i + (j-i)/2;
		}
		return false;
	}
	public static void slist(int v) {
		boolean insert = false;
		for( int i = 0 ; i < list.size() ; i++ ) {
			if ( list.get(i) == v) {
				insert = true;
				break;
			} else if ( list.get(i) > v ) {
				list.add(i,v);
				insert = true;
				break;
			}
		}
		if ( insert == false ) {
			list.add(v);
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(
				System.in)));
	}
	public static BufferedReader getReader(String path) throws Exception{
		return( new BufferedReader(new InputStreamReader(
				new FileInputStream(path))));
	}
	public static int getInt(BufferedReader br)throws Exception {
		String line = br.readLine();
		return Integer.valueOf(line);
	}
	public static String[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		return nstr;
	}
	public static int[] getIntAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
	}
	public static int[] getAryMl(BufferedReader br)throws Exception {
		int n = getInt(br);
		int[] ary = new int[n];
		for( int i=0 ; i < n ; i++ ) {
			ary[i] = getInt(br);
		}
		return ary;
	}
	public static void putAry(int[] ary, int num) {
		for( int i = 0; i < num ; i++ ) {
			System.out.print(ary[i]);
			if ( i < num-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	public static void putAry(int[] ary) {
		putAry(ary, ary.length ) ;
	}
	public static boolean isPrime(int n) {
		int r = (int)Math.sqrt((double)n)+1;
		for( int j = 2 ; j < r ; j += 1) {
			if ( n%j == 0 ) {
				return false;
			}
		}
		return true;
	}

}