import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		String str,end;
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			String[][] h = new String[n][2];
			str = end = "";
			
			for(int i = 0; i < n; i++){
				h[i][0] = sc.next();
				h[i][1] = sc.next();
			}
			m = sc.nextInt();
			
			for(int i = 0; i < m; i++)
				str += sc.next();
			
			x:for(int i = 0; i < str.length(); i++){
				for(int j = 0; j < n; j++)
					if(str.charAt(i) == h[j][0].charAt(0)){
						end += String.valueOf(str.charAt(i)).replaceAll(h[j][0], h[j][1]);
					continue x;}
			end += str.charAt(i);
			}
			
			System.out.println(end);
		}
		sc.close();
	}
}