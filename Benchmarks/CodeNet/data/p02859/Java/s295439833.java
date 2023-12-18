
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double menseki=(double) (Math.PI*r*r);
		double kihonn=Math.PI*1*1;
		int ans=(int) (menseki/kihonn);
		
		System.out.println(ans);
		
	}

}
