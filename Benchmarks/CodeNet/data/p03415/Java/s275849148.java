import java.util.Scanner;

public class Main{
	static  int c=1;
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		String s[]=new String[3];
		int i,j;
		for(i=0;i<3;i++){
				s[i]=stdin.next();
			}
		for(i=0;i<3;i++){
			char cc[]=s[i].toCharArray();
			System.out.print(cc[i]);
		}
	}
}
