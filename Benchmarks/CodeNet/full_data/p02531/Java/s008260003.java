import java.util.Scanner;

class Main{
	static String a[]=new String[1001];
	static int p;
	public static void push(String s){
		a[p]=s;
		p++;
	}

	public static String pop(){
		p--;
		return a[p];
	}

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		p=0;
		while(true){
			String s=stdIn.next();
			if(s.equals("quit"))break;
			else if(s.equals("push")){
				String t=stdIn.next();
				push(t);
			}else{
				System.out.println(pop());
			}
		}
	}

}