import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K;
		String S;
		Scanner sc=new Scanner(System.in);	
		N=sc.nextInt();
		S=sc.next();
		char c[]=S.toCharArray();
		int num=0;
		
		for(int i=0;i<N;i++) {
			if(i!=N-1) {
				if(c[i]=='#'&&c[i+1]=='.') {
					num++;
					if(i+2<N) {
						if(c[i+2]=='#') {
							c[i]='#';
						}else {
							c[i]='.';
						}
					}else {
						c[i]='.';
					}
					
					
					if(i-2>0) {
						i=i-2;
					}
				}
			}
			
		}
			
		System.out.println(num);
	}
}
