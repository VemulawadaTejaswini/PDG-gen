import java.util.HashMap;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0)break;
			HashMap<String,String> map = new HashMap<String,String>();
			String ans="";
			for(int i =0;i<n;i++){
				String s1 = cin.next();
				String s2 = cin.next();
				map.put(s1,s2);
			}
			int m = cin.nextInt();
			for(int i = 0;i<m;i++){
				String s = cin.next();
				if(map.containsKey(s)){
					ans+=map.get(s);
				}
				else{
					ans+=s;
				}
			}
			System.out.println(ans);
		}
	}
}