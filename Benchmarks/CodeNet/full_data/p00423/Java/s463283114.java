import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a = 0, b = 0;
		for(int i=0;i<n;i++){
			int ta = stdIn.nextInt();
			int tb = stdIn.nextInt();
			if(ta>tb){
				a+=ta;
				a+=tb;
			}
			else if(ta<tb){
				b+=ta;
				b+=tb;
			}
			else{
				a+=ta;
				b+=tb;
			}
		}
		System.out.println(a+" "+b);
	}
}