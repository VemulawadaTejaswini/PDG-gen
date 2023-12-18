import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int R = scan.nextInt();
			int S = scan.nextInt();
			int P = scan.nextInt();
			String T = scan.next();//|T| = N
			char[] t = new char[N];
			char[] dasita = new char[N];
			t = T.toCharArray();
			long goukei = 0;
			
			for(int i = 0;i<N;i++) {
				if(i<=K-1){
						dasita[i]=katu(t[i]);
						switch(dasita[i]) {
						case 'r':goukei+=R;break;
						case 's':goukei+=S;break;
						case 'p':goukei+=P;break;
						}
				}else{
					if(t[i]=='r') {
						if(dasita[i-K]=='p') {
							if(i+K<N) {
								dasita[i] = saiteki(dasita[i-K],katu(t[i+K]));
							}else {
								dasita[i]='r';	
							}
						}else {
						goukei+=P;dasita[i]='p';
						}
					}
					if(t[i]=='s') {
						if(dasita[i-K]=='r') {
							if(i+K<N) {
								dasita[i] = saiteki(dasita[i-K],katu(t[i+K]));
							}else {
								dasita[i]='s';	
							}
							}else {
							goukei+=R;dasita[i]='r';
							}
					}
					if(t[i]=='p') {
						if(dasita[i-K]=='s') {
							if(i+K<N) {
								dasita[i] = saiteki(dasita[i-K],katu(t[i+K]));
							}else {
								dasita[i]='p';	
							}
							}else {
							goukei+=S;dasita[i]='s';
							}
					}	
					
				}
				
				//System.out.println(dasita[i]);
			}
			
			
			
			System.out.println(goukei);
			
		}
		
		
		
		
	}

		
		private static char katu(char c) {
			char s='1';
			
			if(c=='r')s='p';
			if(c=='s')s='r';
			if(c=='p')s='s';
			
			return s;
		}
		
		private static char saiteki(char mae,char ato) {
			if(mae=='r') {//チーパー
				if(ato=='r')return's';//なんでもいい
				if(ato=='s')return'p';
				if(ato=='p')return's';
				
			}
			if(mae=='s') {//グーパー
				if(ato=='r')return'p';
				if(ato=='s')return'r';//なんでもいい
				if(ato=='p')return'r';
				
			}
			if(mae=='p') {//チーグー
				if(ato=='r')return's';
				if(ato=='s')return'r';
				if(ato=='p')return'r';//なんでもいい
			}
			return'2';
		}
		
		
		
	
		

}
