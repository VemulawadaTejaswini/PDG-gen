import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x,ans=0,mon=100;
		x = sc.nextLong();
		while(mon<x) {
			mon+=mon*0.01;
			ans++;
		}
	System.out.println(ans);
	}
}