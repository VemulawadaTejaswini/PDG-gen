import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		byte[] inArray = new byte[System.in.available()];
		System.in.read(inArray);
		System.out.println(Math.pow(inArray[0], 3));
	}

}