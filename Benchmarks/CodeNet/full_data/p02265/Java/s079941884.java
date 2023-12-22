import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	static int[] numStack = new int[100];
	static int numOfs= 0;
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader breader;
		if( args.length > 0 && args[0].equals("File") == true ) {
			breader = getReader("C:\\Users\\USER\\Downloads\\ALDS1_3_C-in10.txt");
		} else {
			breader = getReader();
		}
		int num = getInt(breader);
		dList list = new dList();
		for( int i = 0 ; i < num ; i++ ) {
			String[] cmd = getAry(breader);
			if ( cmd[0].equals("insert") == true) {
				list.insert(Integer.valueOf(cmd[1]));
			} else if ( cmd[0].equals("delete")) {
				list.delete(Integer.valueOf(cmd[1]));
				
			} else if ( cmd[0].equals("deleteFirst")) {
				list.deleteFirst();
			} else if ( cmd[0].equals("deleteLast")) {
				list.deleteLast();
			}
		}
		list.show();
	}
	public static class dList {
		eList list=null;
		eList last=null;
		eList garbage=null;
		static final int anum = 2000;
		eList[] eAry = new eList[anum];
		public void insert(int key) {
			eList wk;
			if ( garbage == null ) {
				wk = new eList(key);
			} else {
				wk = garbage;
				wk.next = null;
				garbage = garbage.next;
				wk.key = key;
			}
			wk.next = list;
			wk.prev = null;
			if ( list == null ) {
				last = wk;
			} else {
				list.prev = wk;
			
			}
			list = wk;
			//????????????????????????????????\
			int idx = getIdx(key);
			wk.knext = eAry[idx] ;
			if ( eAry[idx] != null ) {
				eAry[idx].kprev = wk;
			} 
			wk.kprev = null;
			eAry[idx] = wk;
		}
		public void delete(int key) {
			int idx = getIdx(key);
			for( eList wk = eAry[idx]; wk != null ; wk = wk.knext ){
				if( wk.key == key ) {
					deleteElm(wk);
					break;
				}
			}
		}
		public void deleteElm( eList elm) {
			//????????????
			if ( elm.prev == null ) {
				list = elm.next;
				if ( list != null ) list.prev = null;
			} else {
				elm.prev.next = elm.next;
			}
			if ( elm.next == null ) {
				last = elm.prev;
				if ( last != null ) last.next = null;
			} else {
				elm.next.prev = elm.prev;
			}
			//??????????????????????????????
			int idx = getIdx(elm.key);
			if ( elm.kprev == null ) {
				eAry[idx] = elm.knext;
				if ( eAry[idx] != null ) eAry[idx].kprev = null;
			} else {
				elm.kprev.knext = elm.knext;
			}
			if ( elm.knext == null ) {
				/*elAry[idx] = elm.kprev;*/
			} else {
				elm.knext.kprev = elm.kprev;
			}
			//??¬???????????????????????????
			elm.next = garbage;
			elm.prev = null;
			elm.kprev = null;
			elm.knext = null;
			garbage = elm;
			
		
		}
		public void deleteFirst() {
			deleteElm(list);
		}
		public void deleteLast() {
			deleteElm(last);
		}
		public void show() {
			for( eList wk = list ; wk != null ; wk = wk.next){
				System.out.print(wk.key);
				if ( wk.next != null ) {
					System.out.print(" ");
				}
			}
			System.out.println( "" );
		}
		public int getIdx(int key) {
			int idx = key/1000;
			if ( idx >= anum ) idx = 199;
			return idx;
		}
	}
	public static class eList {
		eList next = null;
		eList prev = null;
		eList knext = null;
		eList kprev = null;
		int key;
		public eList(int key) {
			this.key = key;
		}
	}
	public static void strEnqueue(String str) {
		strList.add(str);
	}
	public static void intEnqueue(int num) {
		intList.add(num);
	}
	public static String strDequeue() {
		String val;
		if ( strList.size() > 0 ) {
			val = strList.get(0);
			strList.remove(0);
		} else {
			val = null;
		}
		return val;
	}
	public static int intDequeue() {
		int val;
		if ( intList.size() > 0) {
			val = intList.get(0);
			intList.remove(0);
		} else {
			val = -1;
		}
		return val;
	}
	public static void numPush(int n) {
		numStack[numOfs++] = n;
	}
	public static int numPop() {
		return(Integer.valueOf(numStack[--numOfs]));
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
	public static int cardComp(String left, String right) {
		char l = left.charAt(1);
		char r = right.charAt(1);
		return(l-r);
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