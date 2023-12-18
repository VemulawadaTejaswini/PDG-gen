import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int a=x2-x1;
		int b=y2-y1;
		String s="";
		for(int i=0;i<a;i++){
			s+="R";
		}
		for(int i=0;i<b;i++){
			s+="U";
		}
		for(int i=0;i<a;i++){
			s+="L";
		}
		for(int i=0;i<b;i++){
			s+="D";
		}
		s+="D";
		for(int i=0;i<a;i++){
			s+="R";
		}
		s+="RU";
		for(int i=0;i<b;i++){
			s+="U";
		}
		s+="L";
		s+="U";
		for(int i=0;i<a;i++){
			s+="L";
		}
		s+="LD";
		for(int i=0;i<b;i++){
			s+="D";
		}
		s+="R";
		System.out.print(s);	
	}
}