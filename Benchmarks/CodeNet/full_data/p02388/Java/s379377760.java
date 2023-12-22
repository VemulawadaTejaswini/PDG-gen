import java.io.DataInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int x = new DataInputStream(System.in).readByte();
		System.out.println(x*x*x);
	}

}