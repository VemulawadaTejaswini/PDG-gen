import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		String str,code;
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			String[][] h = new String[n][2];
			str = code = "";
			
			for(int i = 0; i < n; i++){
				h[i][0] = sc.next();
				h[i][1] = sc.next();
			}
			m = sc.nextInt();
			
			x:for(int i = 0; i < m; i++){
				str = sc.next();
				for(int j = 0; j < n; j++)
				if(str.equals(h[j][0])){
					code += str.replaceAll(h[j][0], h[j][1]);
					continue x;
			}
				code += str;
			}
			
			
			System.out.println(code);
		}
	}
}