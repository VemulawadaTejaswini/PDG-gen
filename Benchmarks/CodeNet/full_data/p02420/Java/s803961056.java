import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str, sub;
		int m, h;
		ArrayList<String> ans = new ArrayList<String>();
		
		while(true){
			str = sc.next();
			if(str.equals("-")){
				break;
			}
			
			StringBuilder sb = new StringBuilder(str);
			
			m = sc.nextInt();
			
			for(int i = 0; i < m; i++){
				h = sc.nextInt();
				
				sub = sb.substring(0, h);
				sb.delete(0, h);
				sb.append(sub);
			}
			
			ans.add(sb.toString());
		}
		
		for(String s : ans){
			System.out.println(s);
		}
	}
}