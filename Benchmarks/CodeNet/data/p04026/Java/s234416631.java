import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String s=in.next();
		int q=0;
		while(s.length()>0) {
			int a=-1;
			int b=-1;
			int c=1; 
			for (int i = 1; i < s.length(); i++) {
				if(s.charAt(0)==s.charAt(i)) {
					c++;
					a=1;
					b=i+1;
				}
			}
			if(s.length()>=2 && c>s.length()/2) {
				System.out.println((a+q)+" "+(b+q));;
				break;
			}
			s=s.substring(1,s.length());
			q++;

			if(s.length()==0 && a==-1) {
				System.out.println(a+" "+b);
			}
		}
		
	}
}