import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int num;
		String str;
		char[] ch;
		int ans; 
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			
			ans = 0;
			num = 1;
			for(int i = 1; i <= n; i++){
				num *= i;
			}
			
			str = String.valueOf(num);
			ch = str.toCharArray();
			
			for(int i = ch.length - 1; i >= 0; i--){
				if(ch[i] == '0')ans++;
				else break;
			}
			System.out.println(ans);
		}
	}
}