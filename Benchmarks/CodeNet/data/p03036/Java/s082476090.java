import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt();
		int d=scan.nextInt();
		int x=scan.nextInt();
		scan.close();
		func(r,d,x,1);
	}

	private static void func(int r, int d, int x,int cnt) {
		int ans = r*x-d;
		System.out.println(ans);
		if(cnt<10)func(r,d,ans,cnt+=1);
	}
}