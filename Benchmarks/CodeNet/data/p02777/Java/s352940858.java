import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = new String(in.readLine());
			String[] input1 = new String[2];//空白ごとに値をスプリット
			input1 = line.split(" ");
			line = new String(in.readLine());
			String[] input2 = new String[4];//空白ごとに値をスプリット
			input2 = line.split(" ");
			int num2 = Integer.parseInt(input2[0].trim());
			int num3 = Integer.parseInt(input2[1].trim());
			line = new String(in.readLine());
			//System.out.println(input1[0] + input1[1] + input2[0] + input2[1] + " " + line);
			if(line.equals(input1[0])) {//Sならば
				num2 = num2 - 1;
			}else {
				num3 = num3 - 1;
			}
			System.out.println(num2 + " " + num3);
			
		} catch (IOException e) {
			System.out.print(e);
		}
	}

}
