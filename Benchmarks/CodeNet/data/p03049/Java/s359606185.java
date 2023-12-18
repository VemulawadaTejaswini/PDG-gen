import java.util.*;

public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = new String[20000];
		int acount=0,bcount=0,count=0,answer=0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			if(s[i].charAt(0)=='B') bcount++;
			if(s[i].charAt(s[i].length()-1)=='A') acount++;
			if(s[i].charAt(0)=='B'&&s[i].charAt(s[i].length()-1)=='A') count++;
			answer+=counter(s[i]);
		}
		if(acount==bcount){
			if(acount==count) answer+=acount-1;
			else answer+=acount;
		}else if(acount>bcount){
			answer+=bcount;
		}else answer+=acount;

		System.out.println(answer);
	}



		static int counter(String p){
			int figure=0;
			for(int i=0;i<p.length()-1;i++){
				if(p.charAt(i)=='A'&&p.charAt(i+1)=='B') figure++;
			}
			return figure;
		}
}