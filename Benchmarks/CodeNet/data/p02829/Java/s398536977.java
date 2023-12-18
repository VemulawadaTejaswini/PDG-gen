import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		if(a+b==3){
			ans = 3;
			System.out.print(ans);
		}

		if(a+b==4){
			ans = 2;
			System.out.print(ans);
		}

		if(a+b==5){
			ans = 1;
			System.out.print(ans);
		}

	}
}
