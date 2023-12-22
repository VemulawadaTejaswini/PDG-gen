import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String input;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		input = sc.next();
		return true;
	}
	static void solve(){
		//System.out.println(input);
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			if(c != '@'){
				System.out.print(c);
			}else{
				int j = Integer.parseInt("" + input.charAt(i+1));
				//System.out.print(" j = " + j + " ");
				
				for(int k = 0; k < j; k++){
					System.out.print(input.charAt(i+2));
				}
				i = i + 2;
			}
		}
	}

}