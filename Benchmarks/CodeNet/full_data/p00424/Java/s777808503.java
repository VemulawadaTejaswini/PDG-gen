import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		int n,m;
		StringBuilder str = new StringBuilder();
		StringBuilder code = new StringBuilder();

		while((n = sc.nextInt()) != 0){

			for(int i = 0; i < n; i++)
				map.put(sc.next(), sc.next());

			m = sc.nextInt();
			
			for(int i = 0; i < m; i++){
				str.append(sc.next());

				if(map.containsKey(str.toString()))
					code.append(map.get(str.toString()));
				else
					code.append(str);
				
				str.setLength(0);
			}
			System.out.println(code);
			code.setLength(0);
		}
		sc.close();
	}
}