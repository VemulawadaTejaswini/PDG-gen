import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		for(Scanner s = new Scanner(System.in);s.hasNext();){
			try{
				System.out.println(parse(s.nextLine()));
			}catch(Exception e){
				System.out.println("overflow");
			} 
		}
	}
	
	static Cplx parse(String str)throws Exception{
		if(str.matches("-?\\d+")){
			if(new BigInteger(str).compareTo(BigInteger.valueOf(10000))>0) throw new Exception();
			return new Cplx(new Integer(str),0);
		}
		Deque<Cplx> n = new ArrayDeque<Cplx>();
		Deque<String> q = new ArrayDeque<String>();
		for(int i = 0, j = 0; i < str.length(); i += j){
			String c = str.substring(i,i+1);
			if(c.equals("i")){
				n.push(new Cplx(0,j=1));
			}else if(c.matches("\\d")){
				n.push(parse(str.substring(i,i+(j=t(str.substring(i))))));
			}else if(c.matches("\\(")){
				n.push(parse(str.substring(i+1,i-1+(j=t(str.substring(i))))));
			}else if(c.equals("*")){
				n.push(n.pop().mul(parse(str.substring(i+1,i+(j=t(str.substring(i+1))+1)))));
			}else{
				j = 1;
				q.push(c);
			}
		}
		for(;q.size()>0;){
			String op = q.pop();
			if(op.equals("+")){
				n.push(n.pop().add(n.pop()));
			}else{
				Cplx c = n.pop();
				n.push(n.pop().sub(c));
			}
		}
		return n.pop();
	}
	
	static int t(String str){
		int c = 0, i = 0;
		if(str.matches("[i\\d]+.*")){
			for(;i<str.length() && str.substring(i,i+1).matches("[i\\d]");++i){
			}
			return i;
		}
		for(;i<str.length();++i){
			if(str.charAt(i)=='('){
				++c;
			}else if(str.charAt(i)==')'){
				--c;
				if(c<1){
					return i+1;
				}
			}
		}
		return -1;
	}
	
	static class Cplx{
		int a,b;
		Cplx(int aa, int bb) throws OE{
			if(aa<-10000||10000<aa||bb<-10000||10000<bb){
				throw new OE();
			}
			a=aa;b=bb;
		}
		Cplx add(Cplx c) throws OE{
			return new Cplx(a+c.a,b+c.b);
		}
		Cplx sub(Cplx c) throws OE{
			return new Cplx(a-c.a,b-c.b);
		}
		Cplx mul(Cplx c) throws OE{
			return new Cplx(a*c.a-b*c.b,b*c.a+a*c.b);
		}
		public String toString(){
			String r ="";
			if(a!=0) r+=a;
			if(b!=0){if(b>0&&a!=0)r+="+";r+=b+"i";}
			return r==""?"0":r; 
		}
	}
	
	static class OE extends Exception{}
}