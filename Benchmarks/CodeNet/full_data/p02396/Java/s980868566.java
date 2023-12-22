import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean isContinue = true;
		int idx = 1;
		String str;

		StringBuilder output = new StringBuilder();
		try {

			while (isContinue) {
				str = br.readLine();
				if (str.equals("0")) {
					// ??\????????????
					isContinue = false;
				} else {
					output.append("Case ").append(String.valueOf(idx))
							.append(": ").append(str).append("\n");
					// ?????????????????????
					idx++;
				}
				if(idx % 100 ==0){
					System.out.println(output.toString());
					output.setLength(0);
				}
			}
			if(output.length()>0){
				System.out.println(output.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}