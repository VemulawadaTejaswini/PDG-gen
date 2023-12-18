import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		scan.close();
		int cnt=0;
		int max=0;
		boolean check=false;
		char acgt[] = {'A','C','G','T'};
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<4;j++) {
				if(acgt[j]==s.charAt(i)) {
					cnt++;
					check=true;
					break;
				}
			}
			if(check==false) {
				if(max<cnt)max=cnt;
				cnt=0;

			}
			check=false;
		}
		System.out.println(max);
	}
}