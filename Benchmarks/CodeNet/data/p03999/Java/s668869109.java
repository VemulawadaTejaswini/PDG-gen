import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String numbers = reader.readLine();
			long resultSum = 0;
			int len = numbers.length();
			if(len > 1) {
				int plusSpaces = len -1;
				int[] plusArray = new int[plusSpaces];
				for (int i = 0; i <  (int) Math.pow(2, plusSpaces); i++) {
					String plus = String.format("%"+plusSpaces+"s", Integer.toBinaryString(i)).replace(" ", "0");
					String numbersWithPlus = "";
					for (int j = 0; j < plus.length(); j++) {
						numbersWithPlus += numbers.charAt(j);
						char p = plus.charAt(j);
						if(p == '1') {
							numbersWithPlus += "+";
						}
					}
					numbersWithPlus += numbers.charAt(len-1);
					long sum = 0;
					if(numbersWithPlus.contains("+")) {
						String[] fomula = numbersWithPlus.split("\\+");	//特殊文字なので\\が必要
						for(String value : fomula) {
							sum += Long.parseLong(value);
						}
					} else {
						sum = Long.parseLong(numbersWithPlus);
					}
					resultSum += sum;
				}
			} else {
				resultSum = Integer.parseInt(numbers);
			}
			
			System.out.println(resultSum);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}
}