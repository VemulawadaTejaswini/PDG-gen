import java.util.HashMap;
import java.util.Scanner;

public class Main{

	int p;
	String input;
	HashMap<String, Integer> dict = new HashMap<String, Integer>();

	void run(){
		Scanner in = new Scanner(System.in);
		String line;
		for(;;){
			line = in.next();
			if(line.equals("END_OF_FIRST_PART")) break;
			int w = in.nextInt();
			dict.put(line, w);
		}
		for(;;){
			input = in.next();
			if(input.equals("0")) return ;
			p = 0;
			int ans = mol();
			System.out.println(ans>=0?""+ans:"UNKNOWN");
		}
	}

	int mol(){
		if(p == input.length() || input.charAt(p)==')'){
			return 0;
		}
		int r = mol1();
		if(r==-1) return -1;
		if(p < input.length()){
			int b = mol();
			if(b==-1) return -1;
			r += b;
		}
		return r;
	}

	int mol1(){
		if(input.charAt(p)=='('){
			p++;
			int r = mol();
			if(r==-1) return -1;
			p++;
			r *= num();
			return r;
		}
		else{
			int r = atom();
			if(r == -1) return -1;
			if(p < input.length() && Character.isDigit(input.charAt(p))){
				r *= num();
			}
			return r;
		}
	}

	int atom(){
		StringBuffer bf = new StringBuffer();
		bf.append(input.charAt(p++));
		if(p<input.length() && Character.isLowerCase(input.charAt(p))){
			bf.append(input.charAt(p++));
		}
		String at = bf.toString();
		if(dict.containsKey(at)){
			return dict.get(at);
		}
		else return -1;
	}

	int num(){
		int r = input.charAt(p++) - '0';
		if(p < input.length() && Character.isDigit(input.charAt(p))){
			r = 10*r + input.charAt(p++) - '0';
		}
		return r;
	}

	public static void main(String args[]){
		new Main().run();
	}
}