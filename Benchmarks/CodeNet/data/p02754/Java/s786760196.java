import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		long ans = 0;
		ans=(N/(A+B))*A;
		if (A<=(N%(A+B))){
			ans=ans+A;
		}
		else{
		ans=ans+(N%(A+B));
		}
		System.out.println(ans);
    }
}