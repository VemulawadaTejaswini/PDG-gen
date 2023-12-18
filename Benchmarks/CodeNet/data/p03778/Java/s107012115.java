import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans;
		if(Math.abs(a - b) < w){
			ans = 0;
		}else{
			ans= Math.abs(a - b - w);
		}
		System.out.println(ans);
	}
