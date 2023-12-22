import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			String str=cin.nextLine();
			String data[]=str.split(" ");
			int a=Integer.parseInt(data[0]),b=Integer.parseInt(data[2]),res=0;
			char op[]=data[1].toCharArray();
		
			if(op[0]=='?')break;
			if(op[0]=='+')res=a+b;
			if(op[0]=='*')res=a*b;
			if(op[0]=='-')res=a-b;
			if(op[0]=='/')res=a/b;
		
			System.out.println(res);
		}
	}

}

