import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        int[][] count = new int[N][26];
        
        for( int i = 0; i < N; i++ ){
        	s[i] = sc.next();
        	for( int j = 0; j < s[i].length(); j++ ){
        		for( char k = 'a'; k <= 'z'; k++ ){
        			if( s[i].charAt(j) == k ){
        				count[i][k-'a']++;
        			}
        		}
        	}
        }
        
        int cnt = 0;
        for( int i = 0; i < N; i++ ){
        	for( int j = i+1; j < N; j++ ){
        		boolean flag = true;
        		for( int k = 0; k < s[i].length(); k++ ){
        			if( count[i][k] != count[j][k] ){
        				flag = false;
        				break;
        			}
        		}
        		if( flag == true ){
        			cnt++;
        		}
        	}
        }
        System.out.println( cnt );
        
        sc.close();
    }
}