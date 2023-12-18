import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int h =vd.nextInt();
		int w =vd.nextInt();
		for(int i= 0;i<w+2;++i)System.out.print("#");
		for(int i= 0;i<h;++i)System.out.print("#"+vd.next()+"#");
		for(int i= 0;i<w+2;++i)System.out.print("#");
	}

}
