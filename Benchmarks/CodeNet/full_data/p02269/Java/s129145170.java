import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Main {
	static final int num = 200000;

	public static void main(String[] args) throws Exception {
		BufferedReader br;
		if( args.length > 0 && args[0].equals("File") == true ) {
			br = getReader("C:\\Users\\USER\\Downloads\\ALDS1_4_C-in1.txt");
		} else {
			br = getReader();
		}
		HashTable ht = new HashTable();
		int n = getInt(br);
		String cmd[];
		for( int i = 0 ; i < n ; i++ ) {
			cmd = getAry(br);
			if ( cmd[0].equals("insert")==true) {
				ht.insert(cmd[1]);
			} else if ( cmd[0].equals("find")) {
				if ( ht.find(cmd[1]) == true ) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
	public static class HashTable {
		private String[] strTable;
		public HashTable() {
			strTable = new String[num];
		}
		public int getKeyChar(char c) {
			switch( c ) {
			case 'A':
				return 1;
			case 'T':
				return 2;
			case 'G':
				return 3;
			case 'C':
				return 4;
			default:
				return 0;
			}
		}
		public int getKey(String str) {
			int key = 0;
			int p = 1;
			for( int i = 0; i < str.length() ; i++ ) {
				key += p*getKeyChar(str.charAt(i));
				p *= 5;
			}
			return key;
		}
		public int hashKey(String str) {
			int key = getKey(str);
			return(key%(num-1));
		}
		public void insert(String str) throws Exception {
			int hkey = hashKey(str);
			int hkeysave = hkey;
			while( strTable[hkey] != null ) {
				hkey++;
				if ( hkey > ( num-1 ) ) {
					hkey = 0;
				}
				if ( hkeysave == hkey ) {
					throw new Exception();
				}
			}
			if ( strTable[hkey] == null ) {
				strTable[hkey] = str;
			}
		}
		public boolean find( String str ) throws Exception {
			int hkey = hashKey(str);
			int hkeysave = hkey;
			while( strTable[hkey] != null && !strTable[hkey].equals(str)) {
				hkey++;
				if ( hkey > (num-1)) {
					hkey = 0;
				}
				if ( hkeysave == hkey ) {
					throw new Exception();
				}
			}
			if ( strTable[hkey] == null ) {
				return false;
			} else {
				return true;
			}
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