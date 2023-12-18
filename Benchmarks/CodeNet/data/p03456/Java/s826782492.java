import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double sum=(a*100)+b;
		boolean ok=false;
		for(int i=0; i<100100;i++) {
			if(Math.sqrt(sum)==i) {
				System.out.println("Yes");
				ok=true;
				break;
			}
		}
		if(ok==false) {
		System.out.println("No");
		}

	}

}
