import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = new String(in.readLine());
			String[] input = line.split(" ");
			int r = Integer.parseInt(input[0].trim());
			int D = Integer.parseInt(input[1].trim());
			int x2000 = Integer.parseInt(input[2].trim());
			//System.out.println("入力値は、" + age + "と" + price);
			
			for(int i = 1;i <= 10;i++) {
				System.out.println(r * x2000 - D);
				x2000 = r * x2000 - D;
			}
		} catch (IOException e) {
			System.out.print(e);
		}
	}

}