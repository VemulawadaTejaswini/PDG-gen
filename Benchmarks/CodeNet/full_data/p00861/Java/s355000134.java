import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Bug Hunt
public class Main{

	int line, bug, INVALID = -1;
	Map<Character, R> array;
	
	char[] s;
	int id;
	char get(){
		return s[id++];
	}
	class R{
		int n;
		Map<Integer, Integer> val;
		public R(int n) {
			this.n = n;
			val = new HashMap<Integer, Integer>();
		}
		int get(int x){
			if(x<0||n<=x||!val.containsKey(x))return INVALID;
			return val.get(x);
		}
		int assign(int x, int v){
//			System.out.println("Assign:"+x+" V:"+v);
			if(x<0||n<=x||v==INVALID)return INVALID;
			val.put(x, v);
			return 1;
		}
	}
	
	void program(){
//		System.out.println("Line:" + line);
		char name = get();
		get();
		int e = exp();
//		System.out.println("Left e:"+e);
		char ch = get();
		if(ch!='='){
			array.put(name, new R(e));
			return;
		}
		if(e==INVALID){
			bug = line; return;
		}
		
		int val = exp();
//		System.out.println("E:"+e+" Val:"+val);
		int res = array.get(name).assign(e, val);
//		System.out.println("Res:"+res);
		if(res==INVALID)bug = line;
	}
	int exp(){
		char ch = get();
//		System.out.println("Exp:"+ch);
		if(Character.isDigit(ch)){
			int x = ch-'0';
			for(;;){
				ch = get();
				if(!Character.isDigit(ch))break;
				x = x*10+ch-'0';
			}
			return x;
		}
		char name = ch;
		get();
//		System.out.println(get());
		
		int e = exp();
//		System.out.println("AA:"+s[id]);
		get();
		
		return array.get(name).get(e);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			String str = sc.next();
			if(".".equals(str))break;
			line = 1; bug = 0;
			array = new HashMap<Character, R>();
			for(;;){
				s = (str+"$").toCharArray();
				id = 0;
				if(bug==0)program();
				str = sc.next();
				if(".".equals(str))break;
				line++;
			}
			System.out.println(bug);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}