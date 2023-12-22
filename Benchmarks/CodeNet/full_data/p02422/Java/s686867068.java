import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String str=sc.next();
	private static int q=sc.nextInt();
	public static void main(String[] args){
		for(int i=0;i<q;i++){
			String command=sc.next();
			if(command.equals("print")) print();
			if(command.equals("reverse")) reverse();
			if(command.equals("replace")) replace();
		}
	}
	private static void print(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(str.substring(a,b+1));
	}
	private static void reverse(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		String rev="";
		for(int i=b;i>=a;i--){
			rev=rev+String.valueOf(str.charAt(i));
		}
		str=str.substring(0,a)+rev+str.substring(b+1);
	}
	private static void replace(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		String p=sc.next();
		StringBuilder buff=new StringBuilder();
		buff.append(str.substring(0,a));
		buff.append(p);
		buff.append(str.substring(b+1));
		str=buff.toString();
	}
}