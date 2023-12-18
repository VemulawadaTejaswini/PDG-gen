import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int last=n-1;
		int medium=(first+last+1)/2;
		System.out.println(0);
		String fS=sc.next();
		if(fS.startsWith("V")) {
			return;
		}
		while(true) {
			System.out.println(medium);
			String s=sc.next();
			if(s.startsWith("V")) {
				return;
			}
			else if((s==fS&&(medium-first)%2==1)||
					 (s!=fS&&(medium-first)%2==0)){
				last=medium;
			}
			else {
				first=medium;
				fS=s;
			}
			medium=(first+last+1)/2;
		}
		
	}
	}
