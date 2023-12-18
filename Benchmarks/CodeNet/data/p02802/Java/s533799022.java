import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int p[]=new int[m];
		String s[]=new String[m];
		for(int i=0;i<m;i++) {
			p[i]=scan.nextInt();
			s[i]=scan.next();
		}
		scan.close();

		int ans_array[]= new int[n];
		for(int i=0;i<n;i++) {
			ans_array[i]=0;
		}
		int wrong=0,ans=0;
		for(int i=0;i<m;i++) {
			if(ans_array[p[i]-1]==0 ) {
				if(s[i].equals("AC")) {
					ans++;
					ans_array[p[i]-1]=1;
				}else {
					wrong++;
				}
			}
		}

		System.out.println(ans+" "+wrong);
	}
}