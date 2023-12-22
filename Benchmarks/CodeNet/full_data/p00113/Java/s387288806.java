import java.util.*;
import java.io.*;

public class Main{
	public String circulate(int n, int m){
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < n; i++){
			ans.append(" ");
		}
		for(int i = n; i <= m; i++){
			ans.append("^");
		}
		return ans.toString();
	}
	
	public void solve() throws IOException{
		Scanner stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int p = stdIn.nextInt();
				int q = stdIn.nextInt();
				Map<Integer, Integer> map = new HashMap<Integer, Integer>();		
				StringBuilder ans = new StringBuilder();
				int index = 0;
				int n = 10*p/q;
				int m = 10*p%q;
		outer:	while( true ){
					ans.append(n);
					if( m == 0 ){
						System.out.println(ans);
						break;
					}
					for(Integer x : map.keySet()){
						if( x == m ){
							if( ans.charAt(map.get(x))-'0' == n ){
								ans.deleteCharAt(ans.length()-1);
								System.out.println(ans);
								System.out.println(circulate(map.get(x), index-1));
							} else {
								System.out.println(ans);
								System.out.println(circulate(map.get(x)+1, index));
							}
							break outer;
						}
					}
					if( m != q ){
						map.put(m, index);
					}		
					n = 10*m/q;
					m = 10*m%q;			
					index++;
				}
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
			
	public static void main(String[] args) throws IOException{ 
		new Main().solve();
	}
}
			