import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	class Comp{
		boolean overflow;
		int r;
		int i;

		public boolean isOverflow(double r){
			return Math.abs(r)>10000;
		}

		Comp(int r,int i,boolean overflow){
			this.r=r;
			this.i=i;
			this.overflow=isOverflow(r) ||isOverflow(i) ||overflow;
		}
		public Comp a(Comp c){
			return new Comp(r+c.r,i+c.i,isOverflow((double)r+c.r)||isOverflow((double)i+c.i)|| overflow || c.overflow);
		}
		public Comp s(Comp c){
			return new Comp(r-c.r,i-c.i,isOverflow((double)r-c.r)||isOverflow((double)i-c.i)||overflow || c.overflow);
		}
		public Comp m(Comp c){
			return new Comp(r*c.r-i*c.i,r*c.i+i*c.r,isOverflow(1.0*r*c.r-1.0*i*c.i)||isOverflow(1.0*r*c.i+1.0*i*c.r)||overflow || c.overflow);
		}
		public String toString(){
			if(overflow)return "overflow";

			StringBuilder res=new StringBuilder();

			if(r!=0)res.append(r);
			if(r!=0 && i>0)res.append("+");
			if(i!=0)res.append(i+"i");
			if(r==0 && i==0)res.append(0);
			return res.toString();
		}
	}
	public int index=0;

	public Comp factor(char[] f){
		Comp r=term(f);
		while(f.length>index && f[index]=='*'){
			++index;
			Comp _r=term(f);
			r=r.m(_r);
		}
		return r;
	}
	public Comp equation(char[] f){
		Comp r=factor(f);
		while(f.length>index && (f[index]=='+' || f[index]=='-')){
			char op=f[index];
			++index;
			Comp _r=factor(f);
			if(op=='+')r=r.a(_r);
			else r=r.s(_r);
		}
		return r;
	}
	public Comp term(char[] f){
		if(f[index]=='('){
			++index;
			Comp r=equation(f);
			++index;// )skip
			return r;
		}else{
			boolean isminus=false;
			if(f[index]=='-'){
				isminus=true;
				index++;
			}else if(f[index]=='+'){
				index++;
			}
			int val=0;
			while(f.length>index && Character.isDigit(f[index])){
				val=val*10+(f[index]- '0');
				index++;
			}
			if(index<f.length && f[index]=='i'){
				if(val==0)val=1;
				index++;
				return new Comp(0,isminus?-val:val,false);
			}else{
				return new Comp(isminus?-val:val,0,false);
			}
		}
	}

	public void run() {
		while(sc.hasNextLine()){
			index=0;
			char[] f=sc.nextLine().toCharArray();
			ln(equation(f));
		}
	}


	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}