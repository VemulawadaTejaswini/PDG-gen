import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		while(true){
			s = sc.nextLine();
			if(s.length() == 1)
				break;
			Bracket b = new Bracket();
			for(int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				if(c == '(' || c == ')' || c == '[' || c == ']'){
					b.c[b.n] = c;
					b.n++;
				}
			}
			b.balance();
			System.out.println(b.answer == 1 ? "yes" : "no");
		}
	}

}

class Bracket{
	int answer = 1;
	char[] c = new char[100];
	int n = 0;
	void balance(){
		balance(0, n-1);
	}
	void balance(int left, int right){
		if(left <= right){
			int bal = 0;
			for(int i = left; i <= right; i++){
				if(c[i] == '(' || c[i] == '[')
					bal++;
				if(c[i] == ')' || c[i] == ']')
					bal--;
				if(bal < 0){
					answer = 0;
					break;
				}
				if(bal == 0){
					if((c[left] == '(' && c[i] == ')') ||
					(c[left] == '[' && c[i] == ']')){
						balance(left+1, i-1);
						balance(i+1, right);
					}else
						answer = 0;
					break;
				}	
			}
			if(bal > 0)
				answer = 0;
		}
	}
}