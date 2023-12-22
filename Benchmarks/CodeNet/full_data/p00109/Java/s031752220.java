import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(br.readLine());
		Main calc=new Main();
		for(int n=0;n<line;n++){
			String str=br.readLine();
			Integer num=calc.doCalc(str.substring(0,str.length()-1));
			if(num!=null){
				System.out.println(num);
			}
		}
	}

	Integer doCalc(String expr){
		return doCalc3(expr);
	}
	
	int check(String expr){
		int count=0;
		int n=-1;
		while(n<expr.length()){
			n=expr.indexOf("(",n+1);
			if(n!=-1){
				count++;
			}
			else{
				break;
			}
		}
		n=-1;
		while(n<expr.length()){
			n=expr.indexOf(")",n+1);
			if(n!=-1){
				count--;
			}
			else{
				break;
			}
		}
		return count;
	}

	Integer doCalc3(String expr){
		ArrayList<String> num=new ArrayList<String>();
		String[] param=expr.split("\\Q+\\E");
		int m;
		ArrayList<String> sp=new ArrayList<String>();
		for(m=0;m<param.length;m++){
			String[] str=param[m].split("-");
			for(int n=0;n<str.length;n++){
				sp.add(str[n]);
				sp.add("-");
			}
			sp.remove(sp.size()-1);
			sp.add("+");
		}
		sp.remove(sp.size()-1);
		
		m=0;
		while(m<sp.size()){
			int n=check(sp.get(m));
			if(n==0){
				num.add(sp.get(m));
				m++;
			}
			else{
				String str=sp.get(m);
				do{
					m++;
					str+=sp.get(m);
				} while(check(str)!=0);
				num.add(str);
				m++;
			}
		}

		Integer n=doCalc2(num.get(0));
		m=1;
		while(m<num.size()){
			try {
				if(num.get(m)=="+"){
					n+=doCalc2(num.get(m+1));
				}
				else{
					n-=doCalc2(num.get(m+1));
				}
				m+=2;
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.err.println(num.get(m)+"演算子の後には数字が来なくてはなりません。");
				return null;
			} catch (NullPointerException e){
				return null;
			}
		}
		return n;
	}

	Integer doCalc2(String expr){
		ArrayList<String> num=new ArrayList<String>();
		String[] param=expr.split("\\Q*\\E");
		int m;
		ArrayList<String> sp=new ArrayList<String>();
		for(m=0;m<param.length;m++){
			String[] str=param[m].split("/");
			for(int n=0;n<str.length;n++){
				sp.add(str[n]);
				sp.add("/");
			}
			sp.remove(sp.size()-1);
			sp.add("*");
		}
		sp.remove(sp.size()-1);
		
		m=0;
		while(m<sp.size()){
			int n=check(sp.get(m));
			if(n==0){
				num.add(sp.get(m));
				m++;
			}
			else{
				String str=sp.get(m);
				do{
					m++;
					str+=sp.get(m);
				} while(check(str)!=0);
				num.add(str);
				m++;
			}
		}

		Integer n=doCalc1(num.get(0));
		m=1;
		while(m<num.size()){
			try{
				if(num.get(m)=="*"){
					n*=doCalc1(num.get(m+1));
				}
				else{
					n/=doCalc1(num.get(m+1));
				}
				m+=2;
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.err.println(num.get(m)+"演算子の後には数字が来なくてはなりません。");
				return null;
			} catch (NullPointerException e){
				return null;
			}
		}
		return n;
	}

	Integer doCalc1(String expr){
		if(expr.charAt(0)=='('){
			if(expr.indexOf(")")!=-1){
				int n=check(expr);
				if(n==0){
					return doCalc3(expr.substring(1,expr.length()-1));
				}
				else if(n>0){
					System.err.println("(が多いか)が足りません。:"+expr);
					return null;
				}
				else{
					System.err.println(")が多いか(が足りません。:"+expr);
					return null;
				}
			}
			else{
				System.err.println(")が見つかりません。:"+expr);
				return null;
			}
		}
		else if(expr.charAt(0)!=')'){
			try {
				return new Integer(expr);
			} catch (NumberFormatException e) {
				System.err.println("数字でないものが入力されています。:"+expr);
				return null;
			}
		}
		else{
			System.err.println("(がありません。:"+expr);
			return null;
		}
	}
}