import java.util.*;
class Main{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	while(true){
		String str=s.next();
		if(str.equals("-"))break;
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			int b=s.nextInt();
			str=str.substring(0,b)+str.substring(b);
		}
		System.out.println(str);
	}
}}