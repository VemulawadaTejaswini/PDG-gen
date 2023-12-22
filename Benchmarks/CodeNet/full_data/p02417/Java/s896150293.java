import java.nio.ByteBuffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(1200);
		do {
			sb.append(br.readLine());
		} while (br.ready());
		String str = sb.toString();
		int len = str.length();
		int[] alpabetCnt = new int[26];
		for (int i = 0; i < len; i++) {
			byte[] bytes = String.valueOf(str.charAt(i)).getBytes();
			int index = 0;
			boolean flg = true;
			for (byte b : bytes) {
				if (judgeByte(b) == 0) {
					flg = false;
				}
				else if (judgeByte(b) == -1) {
					index = b % 65;
				}
				else if (judgeByte(b) == 1) {
					index = b % 97;
				}
			}
			if (flg)
				alpabetCnt[index] = alpabetCnt[index] + 1;
		}
		String label = "a";
		for (int cnt : alpabetCnt) {
			System.out.println(label + " : " + cnt);
			byte[] bs = label.getBytes();
			bs = toBytes(bs[0] + 1);
			label = new String(bs, "US-ASCII");
		}
	}

	private static byte[] toBytes(int n) {
		byte[] bs = new byte[1];
		bs[0] = (byte) (0x000000ff & (n));
		return bs;
	}

	private static int judgeByte(byte b) {
		if (b < 65 | (b > 90 & b < 97) | b > 122) {
			return 0;
		}
		if (b < 91) {
			return -1;
		}
		return 1;
	}
}