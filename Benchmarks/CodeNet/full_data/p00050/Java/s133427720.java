import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		in = sc.nextLine().toCharArray();
		return true;
	}
	
	static void solve(){
		for(int i=0; i<in.length-4;i++){
			if(in[i]=='a'&&in[i+1]=='p'&&in[i+2]=='p'&&in[i+3]=='l'&&in[i+4]=='e'){
				in[i] = 'p';
				in[i+1] = 'e';
				in[i+2] = 'a';
				in[i+3] = 'c';
				in[i+4] = 'h';
			}
			else if(in[i]=='p'&&in[i+1]=='e'&&in[i+2]=='a'&&in[i+3]=='c'&&in[i+4]=='h'){
				in[i] = 'a';
				in[i+1] = 'p';
				in[i+2] = 'p';
				in[i+3] = 'l';
				in[i+4] = 'e';
			}
		}
		System.out.println(in);
	}

}