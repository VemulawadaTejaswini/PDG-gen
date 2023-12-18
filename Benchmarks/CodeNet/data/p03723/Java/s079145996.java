import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int con=0;
		boolean isdivflg = true;
		if(line[0] == line[1] && line[1] == line[2] && line[2] == line[0] && line[0] % 2 == 0) {
			con = -1;
		}else{
			while (true) {
				int[] line_div = new int[3];
				for (int i = 0; i < 3; i++) {
					if (line[i] % 2 == 1) {
						isdivflg = false;
					}
					line_div[i] = line[i] / 2;
				}
				if (isdivflg) {
					line[0] = line[0] - line_div[0] + line_div[2];
					line[1] = line[1] - line_div[1] + line_div[0];
					line[2] = line[2] - line_div[2] + line_div[1];
					con++;
				}else {
					break;
				}

			}
		}
		System.out.println(con);
	}
}
