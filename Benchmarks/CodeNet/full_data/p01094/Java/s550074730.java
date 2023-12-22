import java.util.Scanner;

public class Main{	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int[] c=new int[27];
				for(int i=0; i<=26; i++) {
					c[i]=0;
				}//初期化
				char first='A';
				char second='A'+1;
				int mi=0;
				for(int i=1; i<=n; i++) {
					String str=sc.next();
					c[str.charAt(0)-'A']++;
					if(i==1){
						first=str.charAt(0);
						mi=i;
					}
					else if(first!=str.charAt(0)) {
						if(c[first-'A']<=c[str.charAt(0)-'A']) {
							second=first;
							first=str.charAt(0);
						}
						else if(c[second-'A']<c[str.charAt(0)-'A']) {
							second=str.charAt(0);
						}
					}
					if(c[first-'A']-c[second-'A']>n-i) {
						for(int j=i+1; j<=n; j++) {
							String str2=sc.next();
						}
						mi=i;
						break;
					}
				}
				if(c[first-'A']==c[second-'A']) {
					System.out.println("TIE");
				}
				else {
					System.out.println(first+" "+mi);
				}
			}
		}
	}
}
