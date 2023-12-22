import java.awt.geom.Point2D;
import java.lang.Character.Subset;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0109();
	}

	class AOJ0109{
		char[] line;
		int pos=0;
		private int expr(){
			int ret = term();
			while(true){
				if(pos>=line.length)break;
				char op = line[pos];
				if( (op=='+') || (op=='-')){
					int old = ret;
					++pos;
					ret = term();
					if(op=='+')ret=old+ret;
					if(op=='-')ret=old-ret;
				}else break;
			}
			return ret;
		}

		private int term(){
			int ret = fact();
			while(true){
				if(pos>=line.length)return ret;
				char op = line[pos];			
				if( (op=='*') || (op=='/') ){
					int old = ret;
					++pos;
					ret = fact();
					if(op=='*')ret = old*ret;
					if(op=='/')ret = old/ret;
				}else break;
			}
			return ret;
		}

		private int fact(){
			if(Character.isDigit(line[pos])){
				int ret=line[pos]-'0';
				++pos;
				if(pos>=line.length)return ret;
				while(Character.isDigit(line[pos])){
					ret=ret*10+(line[pos]-'0');
					++pos;
				}
				return ret;
			}else if(line[pos]=='('){
				++pos;
				int ret=expr();
				++pos; // ")"
				return ret;
			}
			return 0;
		}
		void doIt(){
			String[] a = in.next().split("=");
			line = a[0].toCharArray();
			pos = 0;
			System.out.println(expr());
		}

		public AOJ0109() {
			int n = in.nextInt();
			for(int i=0;i<n;i++)doIt();
		}
	}
}