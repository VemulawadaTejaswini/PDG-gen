import java.io.IOException;

public class Main {
	static final int SIZE = 8 * ((8 + 4) * 8);// 8桁＋終端　を　8行
	static byte[] buf = new byte[SIZE];// 入力データをすべて格納する
	static int count = 0;// 文字の先頭からの順番

	public static void main(String[] args) {
		try {
			System.in.read(buf, 0, SIZE);
			int box[] = new int[4];
			int i = 0;
			int head = 0;
			int[] x = new int[4];
			while (i < 4) {
				if (buf[count] == '1') {
					box[i] = count;
					x[i] = head;
					i++;
				}
				if (buf[count] != '0' && buf[count] != '1')
					head = 0;
				else
					head++;
				count++;
			}
			if (box[0] == box[1] - 1) {
				// ACEG
				switch (x[2] - x[0]) {
				case -1:
					System.out.println("G");
					break;
				case 0:
					System.out.println("A");
					break;
				case 1:
					System.out.println("E");
					break;
				case 2:
					System.out.println("C");
					break;
				}
			} else {
				// BDF
				switch (x[3] - x[0]) {
				case -1:
					System.out.println("D");
					break;
				case 0:
					System.out.println("B");
					break;
				case 1:
					System.out.println("F");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}