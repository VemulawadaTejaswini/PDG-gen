import java.util.Scanner;public class Main{public static void main(String[]args){Scanner scan=new Scanner(System.in);
		//String str=scan.next();
		String a=scan.next();
		int count=0;
		int c=0;
		for(int i=0;i<a.length()-1;i++) {
			String str=a.substring(i,i+2);
			if(str.equals("01")||str.equals("10")) {
				count+=2;
				StringBuilder S=new StringBuilder();
				S.append(a);
				S.replace(i,i+2,"");
				a=S.toString();
				c=1;
				if(i!=0) {
					i-=2;
				}
			}
		}
		System.out.println(count);
	}
}