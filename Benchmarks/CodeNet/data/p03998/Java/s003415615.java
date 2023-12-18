import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		scan.close();
		int cnt[]= {0,0,0};
		int next=0;
		char fin='f';
		while(true){
			switch(next) {
				case 0:
					if(a.length()==cnt[0])fin='A';
					else if(a.charAt(cnt[next])=='b')next=1;
					else if(a.charAt(cnt[next])=='c')next=2;
					cnt[0]++;
					break;
				case 1:
					if(b.length()==cnt[1])fin='B';
					else if(b.charAt(cnt[next])=='a')next=0;
					else if(b.charAt(cnt[next])=='c')next=2;
					cnt[1]++;
					break;
				case 2:
					if(c.length()==cnt[2])fin='C';
					else if(c.charAt(cnt[next])=='b')next=1;
					else if(c.charAt(cnt[next])=='a')next=0;
					cnt[2]++;
					break;
			}
			if(fin!='f')break;
		}
		System.out.println(fin);
	}
}