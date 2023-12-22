import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer[]> alArrFinalPos = new ArrayList<Integer[]>();

		while(true) {
			String[] arrStrHW = buffReader.readLine().split(" ");
			int h = Integer.parseInt(arrStrHW[0]);
			int w = Integer.parseInt(arrStrHW[1]);

			if(h == w && h == 0) break;

			String[][] arrHWWay = new String[h][w];
			for(int i = 0; i < h; i++) arrHWWay[i] = getStringCharArr(buffReader.readLine());

			int hPos = 0;
			int wPos = 0;

			ArrayList<Integer[]> alArrPosWay = new ArrayList<Integer[]>();
			walkWall:while(true) {
				switch (arrHWWay[hPos][wPos]) {
					case ">": wPos++; 	break;
					case "<": wPos--; 	break;
					case "^": hPos--; 	break;
					case "v": hPos++; 	break;
					default:			break;
				}

				if(arrHWWay[hPos][wPos].equals(".")) {
					Integer[] arrFinalPos = new Integer[2];
					arrFinalPos[0] = hPos;
					arrFinalPos[1] = wPos;
					alArrFinalPos.add(arrFinalPos);
					break;
				} else {
					for(Integer[] arrSearchBasePosition: alArrPosWay) {
						if(hPos== arrSearchBasePosition[0] && wPos == arrSearchBasePosition[1]) {
							alArrFinalPos.add(null);
							break walkWall;
						}
					}
				}

				Integer[] arrPos = new Integer[2];
				arrPos[0] = hPos;
				arrPos[1] = wPos;

				alArrPosWay.add(arrPos);
			}
		}

		for(Integer[] arrFinalPos: alArrFinalPos) {
			System.out.println(arrFinalPos == null ? "LOOP" : arrFinalPos[2] + " " + arrFinalPos[0]);
		}
	}

	public static String getStringCharAt(String str, int position) {
		return String.valueOf(str.charAt(position));
	}

	public static String[] getStringCharArr(String str) {

		String[] arrResult = new String[str.length()];

		for(int i = 0; i < str.length(); i++) arrResult[i] = getStringCharAt(str, i);

		return arrResult;
	}
}