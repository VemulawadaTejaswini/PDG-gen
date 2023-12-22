import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] in;
	static HashSet<Character> left = new HashSet<Character>();
	static HashSet<Character> right = new HashSet<Character>();
	public static void main(String[] args) {
		char[] l = {'q','w','e','r','t',
					'a','s','d','f','g',
					'z','x','c','v','b'};
		for(int i = 0; i < l.length; i++)left.add(l[i]);
		char[] r = {'y','u','i','o','p',
					'h','j','k','l',
					'n','m'};
		for(int i = 0; i < r.length; i++)right.add(r[i]);
	
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		in = sc.next().toCharArray();
		if(in[0] == '#')return false;
		return true;
	}
	
	static void solve(){
		int res = 0;
		boolean isLeft = false, isRight = false;
		if(right.contains(in[0])){
			isRight = true;
		}else{
			isLeft = true;
		}
		for(int i = 1; i < in.length; i++){
			if(right.contains(in[i])){
				if(isLeft)res++;
				isRight = true;
				isLeft = false;
			}else{
				if(isRight)res++;
				isLeft = true;
				isRight = false;
			}
		}
		System.out.println(res);
	}

}