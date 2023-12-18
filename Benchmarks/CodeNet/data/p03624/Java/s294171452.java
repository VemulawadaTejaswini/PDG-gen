import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		byte[] ascii = null;

		try {
			ascii = str.getBytes("US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Arrays.sort(ascii);
		HashSet<Byte> set = new HashSet<>();
		for(int i = 0; i < ascii.length; i++){
			set.add(ascii[i]);
		}

		if(set.size() == 26){
			System.out.println("None");
		}else{
			for(int i = 97; i < 122; i++){
				if(!set.contains((byte)i)){
					System.out.println((char)(byte)i);
					break;
				}
			}
		}
	}
}