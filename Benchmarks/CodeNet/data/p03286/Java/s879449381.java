import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==0){
			System.out.println(0);
			sc.close();
			return;
		}		//0のとき自明に0
		String s="";
		int m = 1;		//数字の正負の回転
		while (n!=0){
			int d =0;
			if (Math.abs(n)%2==1) d = 1;
			s = d + s;
			n = (n - d*m )/2;		//-2,-8,-32などのときに、足していけばOKAY
			m*=-1;
		}
		System.out.println(s);
		sc.close();
	}

}
