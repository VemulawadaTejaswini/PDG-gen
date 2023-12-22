import java.util.Scanner;

public class Main {

	static char[] s;
	static int real,image;
	static int idx;
	static boolean overflow;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			s=(str+"  ").toCharArray();
			idx=0;
			overflow=false;
			Imaginal im = expression();
			if(overflow||im.isOverflow()){
				System.out.println("overflow");
			}
			else{
				System.out.println(im);
			}

		}
	}
	
	static Imaginal  expression(){
		Imaginal res=term();
		while(s[idx]=='+'||s[idx]=='-'){
			if(s[idx]=='+'){
				idx++;
				res=res.add(term());
			}
			else{
				idx++;
				res=res.sub(term());
			}
		}
		return res;
	}
	static Imaginal term(){
		Imaginal res=fact();
		while(s[idx]=='*'){
			idx++;
			res=res.mult(fact());
		}
		return res;
	}
	static Imaginal fact(){
		Imaginal res;
		if(s[idx]=='('){
			idx++;
			res=expression();
			idx++;
		}
		else{
			res=number();
		}
		return res;
	}
	static Imaginal number(){
		Imaginal res=new Imaginal(0,0);
		if(s[idx]=='i'){
			res.image=1;
			idx++;
			return res;
		}
		else{
			int sum=0;
			while(Character.isDigit(s[idx])){
				sum=sum*10+(s[idx]-'0');
				idx++;
			}
			res.real=sum;
			if(Math.abs(sum)>=10000){
				overflow=true;
			}
			return res;
		}
	}
}
class Imaginal{
	int real;
	int image;
	Imaginal(int a,int b){
		real=a;
		image=b;
	}
	boolean isOverflow(){
		return Math.abs(real)>=10000||Math.abs(image)>=10000;
	}
	Imaginal add(Imaginal im){
		return new Imaginal(this.real+im.real, this.image+im.image);
	}
	Imaginal sub(Imaginal im){
		return new Imaginal(this.real-im.real, this.image-im.image);
	}
	Imaginal mult(Imaginal im){
		int a = this.real*im.real - this.image*im.image;
		int b =this.real*im.image + this.image*im.real;
		return new Imaginal(a,b);
	}
	public String toString(){
		if(real==0&&image==0){
			return "0";
		}
		String r="";
		String im="";
		if(this.real!=0){
			r=""+this.real;
		}
		
		if(this.image>0){
			im+=""+this.image+"i";
			if(this.real!=0){
				im="+"+im;
			}
		}
		else if(this.image<0){
			im+=""+this.image+"i";
		}
		return r+im;
		
	}
}