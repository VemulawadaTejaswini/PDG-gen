import java.util.*;
class Main{
	static String a[][]=new String[101][1001];
	static int p[]=new int[101];
	public static void push(int n,String s){
		a[n][p[n]]=s;
		p[n]++;
	}

	public static String pop(int n){
		p[n]--;
		return a[n][p[n]];
	}
	public static void move(int n,int m){
		push(m,pop(n));
	}

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Arrays.fill(p,0);
		int XX=stdIn.nextInt();
		while(true){
			String s=stdIn.next();
			if(s.equals("quit"))break;
			else if(s.equals("push")){
				int n=stdIn.nextInt();
				String t=stdIn.next();
				push(n,t);
			}else if(s.equals("move")){
				int n=stdIn.nextInt();
				int m=stdIn.nextInt();
				move(n,m);
			}else{
				int n=stdIn.nextInt();
				System.out.println(pop(n));
			}
		}
	}

}