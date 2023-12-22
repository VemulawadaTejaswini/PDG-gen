import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		String x = sc.nextLine().toLowerCase();
		String line = "";
		while(true) {
			String tmp = sc.nextLine();
			if(tmp.equals("END_OF_TEXT")) {
				break;
			}
			line += " " + tmp;
		}

		int count = 0;

		if(line.toLowerCase().contains(x)) {
			String[] tmp = line.toLowerCase().split(" ");
			for(int i=0;i<tmp.length;i++) {
				if(tmp[i].equals(x)) {
					count++;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
}
