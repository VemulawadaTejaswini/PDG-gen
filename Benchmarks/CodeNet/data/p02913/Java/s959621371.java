import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String S= sc.next();
		int maxline =0;
		for (int i=0;i<S.length();i++) {
			for (int j=i+1;j<S.length();j++) {
				int line =0;
				if (S.charAt(i)==S.charAt(j)) {
					line++;
					for (;line<j-i&&j+line<S.length();line++) {
						if (S.charAt(i+line)!=S.charAt(j+line)) {
							break;
						}
					}
					if(line>maxline) {
						maxline=line;
					}
				}
			}
		}
		System.out.println(maxline);
	}
}