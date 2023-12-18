import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;
		while(n>=4){
			if(n%4==0){
				ans = 1;
				break;
			}
			else{
				n = n - 7;
			}
		}

		if(ans==0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}