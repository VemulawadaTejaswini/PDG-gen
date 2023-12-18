import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		vd.close();
		int i = a/b;
		double j = (double)i;
		double k = ((double)a)/((double)b);
		if(j==k)System.out.println(i);
		else System.out.println(i+1);
		
 		
		
		
	}

}
