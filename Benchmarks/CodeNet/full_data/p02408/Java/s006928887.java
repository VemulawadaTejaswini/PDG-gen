import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Map<String,Integer> sMap = new HashMap<String,Integer>();
		Map<String,Integer> hMap = new HashMap<String,Integer>();
		Map<String,Integer> cMap = new HashMap<String,Integer>();
		Map<String,Integer> dMap = new HashMap<String,Integer>();
		String str;

		int count = Integer.parseInt(scanner.next());
		for (int j = 0; j < count; j++) {
			str = scanner.next();
			int num = scanner.nextInt();
			switch (j) {
			case 0:
				for (int i = 1; i < 13; i++) {
					sMap.put(str,num);
				}
			case 1:				
				for (int i = 1; i < 13; i++) {
					hMap.put(str,num);
				}
			case 2:
				for (int i = 1; i < 13; i++) {
					cMap.put(str,num);
				}
			case 3:
				for (int i = 1; i < 13; i++) {
					dMap.put(str,num);
				}

			}
		}
		for (int j = 0; j < 4; j++) {
			switch (j) {
			case 0:
				for (int i = 1; i < 13; i++) {
					if(sMap.put("S",i).equals(false)){
						sb.append("S"+ " " + i + '\n');
					}
				}
			case 1:				
				for (int i = 1; i < 13; i++) {
					if(hMap.put("H",i).equals(false)){
						sb.append("H"+ " " + i + '\n');
					}
				}
			case 2:
				for (int i = 1; i < 13; i++) {
					if(cMap.put("C",i).equals(false)){
						sb.append("C"+ " " + i + '\n');
					}
				}
			case 3:
				for (int i = 1; i < 13; i++) {
					if(dMap.put("D",i).equals(false)){
						sb.append("D"+ " " + i + '\n');
					}
				}

			}
		}
		System.out.println(sb.toString());
	}
}