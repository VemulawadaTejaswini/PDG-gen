import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int cx,cy,h=0;
		int inputCount = Integer.parseInt(scan.nextLine());

		List<int[]> inputList = new ArrayList<int[]>();
		for(int i=0; i<inputCount; i++) {
			String r = scan.nextLine();
			int xi = Integer.parseInt(r.substring(0, r.indexOf(" ")));
			int yi = Integer.parseInt(r.substring(r.indexOf(" ")+1, r.lastIndexOf(" ")));
			int hi = Integer.parseInt(r.substring(r.lastIndexOf(" ") + 1));
			inputList.add(new int[]{xi, yi, hi});
		}


		for(cx=0; cx<=100; cx++) {
			for(cy=0; cy<=100; cy++) {
				h = (inputList.get(0)[2] + Math.abs(cx-inputList.get(0)[0]) + Math.abs(cy-inputList.get(0)[1]));
				for(int i=1; i<inputList.size(); i++) {
					if(inputList.get(i)[2] != (h - Math.abs(inputList.get(i)[0]-cx) - Math.abs(inputList.get(i)[1]-cy))) {
						h = 0;
						break;
					}				}
				if(h>0) {
					System.out.println(cx + " " + cy + " " + h);
					return;
				}

			}
		}
	}
}