import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int d;
		int sub=101;
		int count=0;
		for(int i=0;i<n;i++){
			d=stdin.nextInt();
			if(sub>d)
				count++;
			sub=d;
		}
		System.out.println(count);
	}
}
