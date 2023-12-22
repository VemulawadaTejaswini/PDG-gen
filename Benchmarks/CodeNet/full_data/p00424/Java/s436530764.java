import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		int n,m;
		String str,code;
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			
			str = code = "";
			
			for(int i = 0; i < n; i++)
				map.put(sc.next(), sc.next());
			
			m = sc.nextInt();
			
			for(int i = 0; i < m; i++){
				str = sc.next();
				if(map.containsKey(str))
					code += map.get(str);
				else
					code += str;
			}	
			System.out.println(code);
		}
		sc.close();
	}
}