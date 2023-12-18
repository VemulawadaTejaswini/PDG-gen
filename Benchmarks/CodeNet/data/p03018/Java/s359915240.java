import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c = s.toCharArray();
		char str[]=new char[3];
		int i;
		int count=0;
		str[0]=c[0];
		str[1]=c[0];
		str[2]=c[0];
		for(i=0;i<c.length;i++) {

			str[0]=str[1];
			str[1]=str[2];
			str[2]=c[i];
			if(str[0]=='A'&&str[1]=='B'&&str[2]=='C') {
				//swap
				c[i]='A';
				c[i-1]='C';
				c[i-2]='B';
				count++;
				//i=0
				i=0;
			}
		}
		System.out.println(count);
	}

}
