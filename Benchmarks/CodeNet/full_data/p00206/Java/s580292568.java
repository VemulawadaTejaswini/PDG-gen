import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static final int MaxNo = 13;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> data = new ArrayList<Integer>();
		String str;

		// ??\?????????
		while (true) {
			str = br.readLine();
			al.add(str);
			if (str.equals("0")) {
				break;
			}
		}

		// ?¨??????????
		String[] buf;
		int sum = 0;
		// int cnt = 0;
		int index = 0;
		int[][] dataList = new int[al.size() / MaxNo][2];
		for (int i = 0; i < al.size(); i++) {
			buf = al.get(i).split(" ");
			if (buf.length < 2) {
				if (i != 0) {
					dataList[index][1] = (int) Math
							.ceil((double) dataList[index][0]
									/ ((double) sum / (double) (MaxNo - 1)));
					index++;
					sum = 0;
				}
				if (buf[0].equals("0")) {
					break;
				}
				dataList[index][0] = Integer.parseInt(buf[0]);
			} else {
				sum += Integer.parseInt(buf[0]) - Integer.parseInt(buf[1]);
			}
			// cnt++;
		}

		// ??????
		for (int i = 0; i < dataList.length; i++) {
			if (dataList[i][1] <= 12) {
				System.out.println(dataList[i][1]);
			} else {
				System.out.println("NA");
			}
		}

	}
}