import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String args[]) {	
		ArrayList<String> st = DefaltIO.ScanStream("%%");
		String n = st.get(0);
		String s = st.get(1);
		
		HashMap<String,String> alpha = new HashMap<String,String>();
		long count = 1;
		for(int i = 0;i < Integer.parseInt(n);i++) {
			char mark = s.charAt(i);
			if(alpha.containsKey(String.valueOf(mark))) {
				
			}else {
				alpha.put(String.valueOf(mark), "");
				int sum=0;
				for(int j=i;j<Integer.parseInt(n);j++ ) {
					if(s.charAt(j) == mark){
						sum++;
					}
				}
				count *= sum+1;
			}
			
		}
		
		System.out.println((count-1)%1000000007);
	}
}
