import java.util.Scanner;

//解き終わってないけど、メモ上げ
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong(), y = sc.nextLong();
		if(x<=1&&y<=1) {
			System.out.println("Brown");
			return;
		}
		if(y>x) {
			long tmp = x;
			x = y;
			y = tmp;
		}
		//x>=y かつ、x>=2で考えてよい
		//(1,1)か、(0,1)、(1,0)になったら負け
		
		//重要な気づきとして、小さい山を1にして渡すと、相手は大きい山から2をとる一択しかとれないことになる。
	}
 
}