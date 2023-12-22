import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1173().doIt();
	}
	
	class AOJ1173{
		
		void solve(){
			char[] text = input.toCharArray();
			ArrayList<Character> list = new ArrayList<Character>();
			boolean sw = true;
			int n = text.length;
			for(int i=0;i<n;i++){
				if(text[i]=='('||text[i]=='[')list.add(text[i]);
				else if(text[i]==')'){
					if(list.size()==0){
						sw = false;break;
					}
					if(list.get(list.size()-1)=='(')list.remove(list.size()-1);
					else{
						sw = false;break;
					}
				}else if(text[i]==']'){
					if(list.size()==0){
						sw = false;break;
					}
					if(list.get(list.size()-1)=='[')list.remove(list.size()-1);
					else{
						sw = false;break;
					}
				}
			}
			if(list.size()>0)sw = false;
			System.out.println(sw? "yes":"no");
		}
		String input;
		void doIt(){
			while(in.hasNext()){
				input = in.nextLine();
				if(input.equals("."))break;
				solve();
			}
		}
	}
	
}