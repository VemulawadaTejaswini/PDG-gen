import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int len=S.length();
		char a='0';
		char b='0';;
		char c='0';
		int count=0,tmp=0;
		Boolean after=false;
		for(int i=0;i<len;i++) {
			a=b;
			b=c;
			c=S.charAt(i);
			if(!after) {
				if(a=='A') {
					tmp++;
				}
				if(b!='B'&&c=='C') {
					tmp=0;
				}
				if(b=='B'&&c=='C') {
					count+=tmp;
					tmp=0;
					after=true;
				}
			}else {
				if(a=='B') {
					if(c=='C') {
						count+=tmp;
						tmp=0;
						after=false;
					}else if(c=='A'){
						count+=tmp;
						tmp=1;
						after=false;

					}
				}
				if(a=='C') {
					if(c=='C') {
						tmp++;
					}else if(c=='A'){
						count+=tmp;
						after=false;
						tmp=1;
					}else {
						count+=tmp;
						after=false;
						tmp=0;
					}
				}

			}

		}
		count+=tmp;
		System.out.println(count);
	}

}
