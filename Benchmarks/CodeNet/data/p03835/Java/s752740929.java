import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
    public static void main(String[] args) {
    	String line="";
    	try  {
        	line = readLine();	

    	
        StringTokenizer st = new StringTokenizer(line, " ");
        String k = st.nextToken();
        String s = st.nextToken();
        
        int k1Value = Integer.parseInt(k);
        int sValue = Integer.parseInt(s);
        int cnt=0;
        int x=0;
        // x y S-x-y
        for (int i = 0;i < sValue+1;i++) {
        	if (i > k1Value) {
        		continue;
        	}
        	for (int j = 0;j < sValue+1;j++) {
        		if (j > k1Value) {
            		continue;
            	} else if (sValue-i-j > k1Value){
            		continue;
            	}
        		
        		if (i+j<=sValue) {
            		//System.out.println(String.valueOf(i) + "," + String.valueOf(j) + "," + String.valueOf(sValue-i-j));
                	cnt++;        			
        		}
        	}
        }
        System.out.println(cnt);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}
