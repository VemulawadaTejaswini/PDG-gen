import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long ans = 0;
		long money = 100;
		while(money < X){
			money = (long)(money * 1.01);
			ans++;
		}
		System.out.println(ans);
	}
}