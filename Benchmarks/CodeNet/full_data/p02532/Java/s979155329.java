import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		StringStack[] s = new StringStack[n + 1];
		
		for (int i = 0; i < n + 1; i++){
			s[i] = new StringStack();
		}
		
		while (true){
			String str = input.next();
			
			if (str.compareTo("quit") == 0) break;
			
			else if (str.compareTo("push") == 0){
				int p = input.nextInt();
				String arf = input.next();
				s[p].push(arf);
			}
			
			else if (str.compareTo("pop") == 0){
				int p = input.nextInt();
				
				System.out.println(s[p].pop());
			}
			
			else if (str.compareTo("move") == 0){
				int p1 = input.nextInt();
				int p2 = input.nextInt();
				
				s[p2].push(s[p1].pop());
			}
		}
	}
}

class StringStack {
	public StringStack(){
		this.s = new Stack<String>();
	}
	
	public String pop(){
		return (this.s.pop());
	}
	
	public void push(String str){
		this.s.push(str);
	}
	
	private Stack<String> s;
}