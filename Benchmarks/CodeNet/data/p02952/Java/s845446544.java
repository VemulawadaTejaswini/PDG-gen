import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.close();
		String nstr=String.valueOf(n);
		int sum=0;
		for(int i=1;i<n;) {
			String s=String.valueOf(i);
			if(s.length()%2!=0) {
				if(nstr.length()==s.length()) {
					sum+=n-Math.pow(10, s.length()-1)+1;
				}else {
					sum+=Math.pow(10, s.length())-1;
				}
			}
			i=i*10;
		}
		System.out.println(sum);
	}

}