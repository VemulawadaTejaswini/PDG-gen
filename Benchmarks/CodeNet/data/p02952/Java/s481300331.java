import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for(int i = 1 ; i <= n ; i++){
			if((dig(i)&1) == 1){
				ans++;
			}
		}

		System.out.println(ans);
	}

	public static int dig(int target){
		int result = 0;
		while(target>0){
			result++;
			target /= 10;
		}
		return(result);
	}
}