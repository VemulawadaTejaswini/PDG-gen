import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static char[] s;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			s = in.next().toCharArray();
			cur = 0;
			System.out.println(exp());
		}
	}
	
	public static int cur;
	public static int exp(){
		int val = add();
		while(s[cur] == '+' || s[cur] == '-'){
			if(s[cur++] == '+'){
				val += add();
			}else val -= add();
		}
		return val;
	}
	
	public static int add(){
		int val = mult();
		while(s[cur] == '*' || s[cur] == '/'){
			if(s[cur++] == '*'){
				val *= mult();
			}else val /= mult();
		}
		return val;
	}
	
	public static int mult(){
		if(s[cur] == '('){
			cur++;
			int val = exp();
			cur++;
			return val;
		}else{
			return num();
		}
	}
	
	public static int num(){
		int d = 0;
		int sign = 1;
		if(s[cur] == '-'){
			sign = -1;
			cur++;
		}
		while(cur < s.length && Character.isDigit(s[cur])){
			d *= 10;
			d += s[cur++]-'0';
		}
		return d*sign;
	}
}