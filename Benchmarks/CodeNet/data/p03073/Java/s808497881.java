import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int answer = 0;
		char c[] = new char[2];
		c[0] = str.charAt(0);
		for(int i = 1; i < str.length(); i++){
			 c[1] = str.charAt(i);
			if(c[0] == c[1]){
				answer += 1;
				if(c[1] == '0'){
					c[1] = '1';
				}else{
					c[1] = '0';
				}
			}
			c[0] = c[1];
		}
		System.out.println(answer);
	}
}