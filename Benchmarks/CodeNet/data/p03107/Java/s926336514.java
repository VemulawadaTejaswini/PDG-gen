import java.util.Scanner;public class Main{public static void main(String[]args){Scanner scan=new Scanner(System.in);
		//String str=scan.next();
		String a=scan.next();
		int count=0;
		int c=0;
		loop:for(int i=0;;i++) {
			if(i>=a.length()-1) {
				if(c==0) {
					break;
				}
				else {
					if(a.length()<=1) {
						break;
					}
					i=0;
					c=0;
				}
			}
			char ch1=a.charAt(i);
			char ch2=a.charAt(i+1);
			if(ch1=='1'&&ch2=='0'||ch1=='0'&&ch2=='1') {
				count+=2;
				StringBuilder S=new StringBuilder();
				S.append(a);
				S.replace(i,i+2,"");
				a=S.toString();
				c=1;
			}
		}
		System.out.println(count);
	}
}