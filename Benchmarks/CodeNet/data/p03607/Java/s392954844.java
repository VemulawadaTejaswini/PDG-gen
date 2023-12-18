import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static int lcm (int a, int b) {return a*b/gcd(a,b);}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		List<Integer>list=new ArrayList<Integer>();
		int a=scan.nextInt();
		int ans=0;
		for(int i=0;i<a;i++) {
			int b=scan.nextInt();
			if(list.contains(b)){
				list.remove(list.indexOf(b));
				ans--;
			}
			else {
				ans++;
				list.add(b);
			}
		}
		System.out.println(ans);
	}

}
