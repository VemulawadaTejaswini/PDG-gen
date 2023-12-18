import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();
		String s = sc.next();
		char c[] = new char[N];
		for(int i = 0;i < N;i++){
			c[i] = s.charAt(i);
		}

		for(int i = 0;i < s.length() - 1;i++){
			if(c[i] == c[i+1]){
				c[i] = '0';
			}
		}

		String str = "";
		for(int i = 0;i < s.length(); i++){
			if(c[i] != '0'){
				str += String.valueOf(c[i]);
			}
		}
		System.out.println(str.length());
	}
}





