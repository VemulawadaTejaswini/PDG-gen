import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a cm * b cm の長方形の面積と外周の長さを求めます。");
		System.out.print("a=");
		int a=Integer.parseInt(br.readLine());
		System.out.print("b=");
		int b=Integer.parseInt(br.readLine());
		int menseki=a*b;
		int gaisyu=2*a+2*b;
		System.out.println(menseki+" "+gaisyu);
	}

}

