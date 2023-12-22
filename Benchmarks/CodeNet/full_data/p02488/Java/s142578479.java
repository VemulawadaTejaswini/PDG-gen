import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ans = "zzzzzzzzzzzzzzzzzzzzz";
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String str = sc.next();
			if(str.compareTo(ans) < 0){
				ans = str;
			}
		}
		System.out.println(ans);
	}
}