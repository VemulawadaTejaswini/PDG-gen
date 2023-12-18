import java.io.*;
import java.util.*;


class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strStdIn = in.readLine();
        
        int cnt = 0;
        
        int n;
        
        Map<String, String> d = new HashMap<String, String>();
        
        String[] ar;
        int m;
        Map<String, String> t = new HashMap<String, String>();
        
        while(strStdIn!=null){ //EOFまで処理継続
            //処理を記載

        		cnt++;
        		
        		if(cnt == 0) {
        			n = Integer.parseInt(in.readLine());
        		}else if (cnt == 1) {
        			ar = in.readLine().split(" ");
        			
        			for(int i =0; i < ar.length; i++) {
        				d.put(ar[i],ar[i]);
        			}
        		}else if (cnt == 2) {
				m = Integer.parseInt(in.readLine());
        		}else if (cnt == 3) {
        			ar = in.readLine().split(" ");
                			
                			for(int i =0; i < ar.length; i++) {
                				t.put(ar[i],ar[i]);
                			}
        		}
        		
            strStdIn = in.readLine();
        }
        
        for (String key1 : t.keySet()) {
            for(String key2 : d.keySet()) {
            		if(t.get(key1) == d.get(key2)) {
            			t.remove(key1);
            			d.remove(key2);
            		}
            }
        }
        
        if(d == null) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
        
        
    }
}
