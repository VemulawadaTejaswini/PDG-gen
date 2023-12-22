import java.util.*;

public class Main {
	String line ;
	int pos;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next() + "#";
			if(str.equals("##")) break;
			str = str.replaceAll("--", "");
			ArrayList<Character> list = new ArrayList<Character>();
			for(int i=0; i < str.length();i++){
				char temp = str.charAt(i);
				if('a' <= temp && temp <= 'k'){
					if(! list.contains(temp)){
						list.add(temp);
					}
				}
			}
			int len = list.size();
			boolean flg = true;
			for(int i=0; i < (1 << len); i++){
				line = new String(str);
				pos = 0;
				for(int j = 0; j < len; j++){
					String temp = ""+list.get(j);
					
					if((i & (1 << j)) != 0){
						line = line.replaceAll(temp, "T");
					}
					else{
						line = line.replaceAll(temp, "F");
					}
				}
				boolean res = eval();
				if(! res){
					flg = false;
					break;
				}
			}
			if(flg) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	private boolean eval() {
		boolean left = exp();
		char op = line.charAt(pos++);
		boolean right = exp();
		return left == right;
	}

	private boolean exp() {
		char temp = line.charAt(pos++);
		switch(temp){
		case 'T':
			return true;
		case 'F':
			return false;
		case '-':
			return (! exp());
		case '(':
			boolean left = exp();
			char op = line.charAt(pos++);
			boolean right;
			switch(op){
			case '*':
				right = exp();
				pos++;
				return (left && right);
			case '+':
				right = exp();
				pos++;
				return (left || right);
			case '-':
				pos++;
				right = exp();
				pos++;
				boolean res = getA(left, right);
				return res;
			}
		}
		return false;
	}

	private boolean getA(boolean left, boolean right) {
		if(left && ! right){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}