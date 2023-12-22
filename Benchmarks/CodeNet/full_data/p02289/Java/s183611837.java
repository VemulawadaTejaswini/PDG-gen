
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

class Main {

	public static void main(String[] args) throws Exception {
		FastScanner scanner = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);//今週知った高速化テク２：これを使う事でオートフラッシュを避ける

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(;;) {
			String order = scanner.nextString();
			if(order.equals("insert")) {
				queue.offer(scanner.nextInt());
			}else if(order.equals("extract")) {
				out.println(queue.poll());
			}else if(order.equals("end")){
				break;
			}
		}

		out.flush();
	}

}

/**
 * 標準APIのScannerと同様の処理を高速でしたい
 * Javaのchar型は実は16ビット割り当てられているけど
 * 0x00から0x7Fまでの文字しか考えない事にした
 * https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
 */
class FastScanner {

	private InputStream inputStream;
	private byte buffer[];
	private int pointer;
	private int bufferLength;
	private char delimiter;

	FastScanner(InputStream in) {
		inputStream = in;
		buffer = new byte[1024];
		pointer = 0;
		bufferLength = 0;
		delimiter = ' ';
	}

	int nextInt() throws IOException {
		int ret = 0;
		if(hasNextElement()) throw new NoSuchElementException();
		boolean isMinus = false;
		byte b = read1Byte();
		if(b==0x2D) isMinus=true;
		while(true) {
			/*
			 * 制御文字なら終了、数字ではない文字ならNumberFormatExceptionを投げる
			 * のは面倒なので数字じゃなければ全部終了にした。
			 */
			if(0x30<=b && b<=0x39) {
				ret = ret*10 +b-0x30;
			}else break;
			b = read1Byte();
		}
		if(isMinus) ret*=-1;
		return ret;
	}

	String nextString() throws IOException {
		if(!hasNextElement()) throw new NoSuchElementException();
		StringBuffer sb = new StringBuffer();
		for(;;) {
			byte b = read1Byte();
			if(b==delimiter || isControlCharacter((char) b)) {
				break;
			}else {
				sb.append(b);
				continue;
			}
		}
		return sb.toString();
	}

	boolean hasNextElement() throws IOException {
		while(hasNextByte() && isControlCharacter((char) buffer[pointer])) {
			pointer++;
		}
		return hasNextByte();
	}

	void setDelimiter(char d) {
		delimiter = d;
	}

	private boolean isControlCharacter(char c) {
		return (c<=0x1F) || c==0x7F;
	}

	private boolean hasNextByte() throws IOException {
		if(pointer < bufferLength) {
			return true;
		}else {
			//読み込む処理
			pointer = 0;
			bufferLength = inputStream.read(buffer);
			if(bufferLength<=0) return false;
		}
		return true;
	}

	private byte read1Byte() throws IOException {
		if(hasNextByte()) return buffer[pointer++];
		else return -1;
	}
}

