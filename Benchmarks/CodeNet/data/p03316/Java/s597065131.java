import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		//A
		/*
		String s = sc.next();
		int ans = 0;
		for(int i = 0 ; i < 4 ; i++){
			if(s.charAt(i) == '+')
				ans++;
			else
				ans--;
		}
		System.out.println(ans);
		*/
		//B
		int n = sc.nextInt();
		int length = String.valueOf( n ).length();
		int sn = 0;
		for(int i  = 0; i < length ; i++){
			sn += n/(int)(Math.pow(10, i))%10;
		}
		if(n % sn == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
