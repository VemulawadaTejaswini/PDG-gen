
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		alphav = new boolean[11];
		while(true){
			String s = sc.next();
			if(s.equals("#"))
				break;
			solve(s);
		}
		
	}

	public void solve(String s) {
		String[] fs = s.split("=");
		boolean res = true;
		for(int i=0;i<(1<<11);i++){
			for(int j=0;j<alphav.length;j++)
				alphav[j] = (i&(1<<j)) > 0; 
			cur = 0;
			f = fs[0];
			boolean r0 = fomula();
			cur = 0;
			f = fs[1];
			boolean r1 = fomula();
			if(r0 != r1){
				res = false;
				break;
			}
		}
		System.out.println(res? "YES" : "NO");
	}

	boolean[] alphav;
	String f;
	int cur = 0;
	private boolean fomula() {
		boolean ret = false;
		char nc = nextc();
		
		if('a' <= nc && nc <= 'k')
			return alphav[nc-'a'];
		
		switch(nc){
		case 'T':
			ret = true;
			break;
		
		case 'F':
			ret = false;
			break;
			
		case '-':
			ret = !fomula();
			break;
			
		case '(':
			ret = fomula();
			nc = nextc();
			switch(nc){
			case '*':
				ret &= fomula();
				break;
			case '+':
				ret |= fomula();
				break;
			case '-':
				nextc();
				ret = !(ret && !fomula());
				nextc();
				break;
			}
			break;
		}
		
		return ret;
	}
	
	private char nextc(){
		char c = f.charAt(cur);
		cur++;
		return c;
	}
}