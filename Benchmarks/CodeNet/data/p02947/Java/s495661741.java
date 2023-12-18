import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static String sort( String str ){
		String r = "";
		for( char i = 'a'; i <= 'z'; i++ ){
			for( int j = 0; j < str.length(); j++ ){
				if( i == str.charAt(j) ){
					r += i;
				}
			}
		}
		return r;
	}
	
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        
        long cnt = 0;
        for( int i = 0; i < N; i++ ){
        	s[i] = sc.next();
        	s[i] = sort(s[i]);
        	if( myMap.containsKey(s[i]) ){
        		int value = myMap.get(s[i]);
        		cnt += value;
        		myMap.put(s[i],value+1 );
        	}
        	else{
        		myMap.put(s[i], 1);
        	}
        }
        
        
        System.out.println( cnt );
        
        sc.close();
    }
}