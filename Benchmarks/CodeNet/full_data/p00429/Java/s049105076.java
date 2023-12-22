import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			List<String> num = new ArrayList<>();
			int n = Integer.parseInt(str);
			str = br.readLine();
			String[] readnum = str.split("");
			int end = readnum.length;
			if (end == 1) {
				num.add("1");
				end = 2;
				n--;
			}
			for (String number : readnum) {
				num.add(number);
			}
			for (int i = 0; i < n; i++) {
				end = num.size();
				int seq = 1;
				for (int j = 1; j < end; j++) {
					if (num.get(j - 1).equals(num.get(j))) {
						seq++;
					} else {
						String[] seqchar = ("" + seq).split("");
						for (String chara : seqchar) {
							num.add(chara);
						}
						num.add(num.get(j - 1));
						seq = 1;
					}
				}
				String[] seqchar = ("" + seq).split("");
				for (String chara : seqchar) {
					num.add(chara);
				}
				num.add(num.get(end - 1));
				num.subList(0, end).clear();

			}
			for (String chara : num)
				System.out.print(chara);
			System.out.println();
			str = br.readLine();
		}
	}
}