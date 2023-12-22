import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(swap(br.readLine()));

	}

	static String swap(String text){
		String NewText= text.replaceAll("apple", "MOMOTARO");
		NewText = NewText.replaceAll("peach", "apple");
		NewText = NewText.replaceAll("MOMOTARO", "peach");

		return NewText;
	}
}