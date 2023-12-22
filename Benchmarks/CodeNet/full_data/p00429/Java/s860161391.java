import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String str, str2;
		char c;
		int cnt, len;
		while((n = sc.nextInt()) != 0){
			str = sc.next();
			for(int i = 0; i < n; i++){
				len = str.length();
				c = str.charAt(0);
				cnt = 1;
				str2 = "";
				for(int j = 1; j < len; j++){
					if(str.charAt(j) == c){
						cnt++;
					}else{
						str2 += "" + cnt + c;
						cnt = 1;
						c = str.charAt(j);
					}
				}
				str2 += "" + cnt + c;
				str = str2;
			}
			System.out.println(str);
		}
	}
}