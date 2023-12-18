import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = -1;
		boolean flg = false;
		char[] array = new char[n+1];
		array[0] = 'S';
		array[1] = 'S';
		for(int i = 0; i < n; i++){
		    if(i != n-1){
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'S';
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'S';
		    }else{
		        if(array[i+1] == array[0] && s.charAt(0) == 'o' && array[i] == array[1]) flg = true;
		        if(array[i+1] == array[0] && s.charAt(0) == 'x' && array[i] != array[1]) flg = true;
		    }
		}
		if(flg){
		    String r = new String(array, 0, n);
		    System.out.println(r);
		    return;
		}
		array[0] = 'S';
		array[1] = 'W';
		for(int i = 0; i < n; i++){
		    if(i != n-1){
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'S';
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'S';
		    }else{
		        if(array[i+1] == array[0] && s.charAt(0) == 'o' && array[i] == array[1]) flg = true;
		        if(array[i+1] == array[0] && s.charAt(0) == 'x' && array[i] != array[1]) flg = true;
		    }
		}
		if(flg){
		    String r = new String(array, 0, n);
		    System.out.println(r);
		    return;
		}
		array[0] = 'W';
		array[1] = 'S';
		for(int i = 0; i < n; i++){
		    if(i != n-1){
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'S';
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'S';
		    }else{
		        if(array[i+1] == array[0] && s.charAt(0) == 'o' && array[i] != array[1]) flg = true;
		        if(array[i+1] == array[0] && s.charAt(0) == 'x' && array[i] == array[1]) flg = true;
		    }
		}
		if(flg){
		    String r = new String(array, 0, n);
		    System.out.println(r);
		    return;
		}
		array[0] = 'W';
		array[1] = 'W';
		for(int i = 0; i < n; i++){
		    if(i != n-1){
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'S';
		        if(array[i] == array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'o') array[i+2] = 'W';
		        if(array[i] != array[i+1] && s.charAt(i+1) == 'x') array[i+2] = 'S';
		    }else{
		        if(array[i+1] == array[0] && s.charAt(0) == 'o' && array[i] != array[1]) flg = true;
		        if(array[i+1] == array[0] && s.charAt(0) == 'x' && array[i] == array[1]) flg = true;
		    }
		}
		if(flg){
		    String r = new String(array, 0, n);
		    System.out.println(r);
		    return;
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

