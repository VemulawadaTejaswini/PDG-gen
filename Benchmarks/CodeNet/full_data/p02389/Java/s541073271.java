import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int a =Integer.parseInt(str1);
		int b =Integer.parseInt(str2);

		int area,cir;
		area = a*b;
		cir = (2*a)+(2*b);

		System.out.println(area+(" ")+cir);

	}

}