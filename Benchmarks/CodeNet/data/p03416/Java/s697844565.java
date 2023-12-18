import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans, at, bt;
		ans = 0;
	for(int i=a;i<=b;i++){
		at=i/1000;
		bt=i-(i/100)*100;
		if(at==bt){
			ans++;
			}
	}
System.out.println(ans);
	}}