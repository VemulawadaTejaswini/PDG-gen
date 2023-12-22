import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int x = Integer.parseInt(std.next());
			int ans = 0;
			if(x==0){
				break;
			}else{
				while(x!=0){
					ans += x%10;
					x /= 10;
				}
			}
			System.out.println(ans);
		}
	}
}