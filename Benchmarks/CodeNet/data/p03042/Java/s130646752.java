import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		
		boolean isYYMM = isYYMM(s);
		boolean isMMYY = isMMYY(s);
		
		if (isYYMM && isMMYY) {
			System.out.println("AMBIGUOUS");
		} else if (isYYMM) {
			System.out.println("YYMM");
		} else if (isMMYY) {
			System.out.println("MMYY");
		} else {
			System.out.println("NA");
		}
	}
	
	private static boolean isYYMM(String date) {
		int year = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
		int month = (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
		
		return ((0 <= year) && (year <= 99) && (1 <= month) && (month <=12));
	}
	
	private static boolean isMMYY(String date) {
		int month = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
		int year = (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
		
		return ((0 <= year) && (year <= 99) && (1 <= month) && (month <=12));
	}
	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try{ 
                str = br.readLine(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
