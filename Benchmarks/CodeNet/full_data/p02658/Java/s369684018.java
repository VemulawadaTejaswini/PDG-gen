import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n =sc.nextInt();
		int ans=1;
		try{for(int i=0;i<n;i++) {
			ans*=sc.nextInt();
		}}
		catch(InputMismatchException e){ ans =-1;}
		System.out.println(ans);
	}
}