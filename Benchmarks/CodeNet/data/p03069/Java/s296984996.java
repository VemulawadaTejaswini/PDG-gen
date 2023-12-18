import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s=sc.next();
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<N-1;i++) {
			if(c[i]=='#'&&c[i+1]=='.') {
				if(i+2<N) {
					if(c[i+2]=='#') {
						c[i+1]='#';
					}
				}else {
					c[i]='.';
				}
				count++;
				i++;
			}
		}
		System.out.println(count);

	}

}
