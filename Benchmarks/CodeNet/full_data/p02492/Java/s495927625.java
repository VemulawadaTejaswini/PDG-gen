import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	String op;
	int a,b;
	public void start(){
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str;
		 String[] list;
		 try {
			while((str=br.readLine())!=null){
				 list = str.split(" ");
				 op	=	list[1];
				 a	=	Integer.parseInt(list[0]);
				 b	=	Integer.parseInt(list[2]);
				 result(a,b,op);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void result(int a, int b, String op){
		if(op.equals("?")){ System.exit(0);}
		if(op.equals("+")){ System.out.println(a+b); }
		if(op.equals("-")){ System.out.println(a-b); }
		if(op.equals("*")){ System.out.println(a*b); }
		if(op.equals("/")){
			if(b==0){
				System.out.println(0);
			}else{
				System.out.println(a/b);
			}
		}
	}
	public static void main(String[] args){
		new Main().start();
	}
}