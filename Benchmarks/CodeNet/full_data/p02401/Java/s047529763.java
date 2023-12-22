import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc;
		boolean con=true;
		while(con){
			sc=new Scanner(System.in);
		int a=sc.nextInt();
		String op=sc.next();
     	int b=sc.nextInt();
		switch(op){
		case "+":{System.out.println(a+b);continue;}
		case "-":{System.out.println(a-b);break;}
		case "*":{System.out.println(a*b);break;}
		case"/":{System.out.println(a/b);break;}
		case"?":sc.close();con=false;
		default:continue;
		}}
	
		
		
		
	
	}
	}