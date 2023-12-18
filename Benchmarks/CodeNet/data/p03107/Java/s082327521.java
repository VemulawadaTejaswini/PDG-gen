import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		
		int ans = 0;
		MyStack<Character> stack = new MyStack<Character>();
		
		for(int i = 0;i < ss.length();i++){
			if(stack.isEmpty()){
				stack.push(ss.charAt(i));
			}else{
				if(stack.peak() != ss.charAt(i)){			//01 or 10 なら削除
					ans += 2;
					stack.pop();
				}else{								//追加
					stack.push(ss.charAt(i));
				}
				
			}
		}
		System.out.println(ans);
		
	}
	
	
}

