import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		scan.close();
		int cnt=0;
		int max=0;
		int check=0;
		char acgt[] = {'A','C','G','T'};
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<4;j++) {
				if(acgt[j]==s.charAt(i)) {
					cnt++;
					check=1;
					break;
				}
			}
			if(check==0||i==s.length()-1) {
				if(max<cnt)max=cnt;
				cnt=0;

			}
			check=0;
		}
		System.out.println(max);
	}
}