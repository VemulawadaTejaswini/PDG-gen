import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int h =vd.nextInt();
		int w =vd.nextInt();
		for(int i= 0;i<w+1;++i)System.out.print("#");
		System.out.println("#");
		for(int i= 0;i<h;++i)System.out.println("#"+vd.next()+"#");
		for(int i= 0;i<w+1;++i)System.out.print("#");
		System.out.println("#");
	}

}
