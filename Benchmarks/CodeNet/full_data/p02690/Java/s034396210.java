import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int rootX = (int) Math.pow(X,1/5) + 1;
		ArrayList<Integer> possibleValues = new ArrayList<Integer>();
		boolean flag = false;
		
		for (int i=rootX; i>0; i--) {
			possibleValues.add(-i);
		}
		
		possibleValues.add(0);
		
		for (int i=1; i<=rootX; i++) {
			possibleValues.add(i);
		}
		
		//31
		//[-2, -1, 0, 1, 2]
		
		if (X>=0) {
			int startIndex = possibleValues.size()-1;
			
			if (Math.pow(possibleValues.get(startIndex), 5) == X) {
				System.out.println(possibleValues.get(startIndex) + " " + "0");
			} else {
				int finalIndex = 0;
				while (startIndex > possibleValues.size()/2 && !flag) {
					while(finalIndex < possibleValues.size()) {
						if (Math.pow(possibleValues.get(startIndex), 5) - Math.pow(possibleValues.get(finalIndex), 5) == X) {
							System.out.println(possibleValues.get(startIndex) + " " + possibleValues.get(finalIndex));
							flag = true;
						}
						finalIndex++;
					}
					finalIndex = 0;
					startIndex--;
				}
			}

		} else {
			int startIndex = 0;
			
			if (Math.pow(possibleValues.get(startIndex), 5) == X) {
				System.out.println(possibleValues.get(startIndex) + " " + "0");
			} else {
				int finalIndex = 0;
				while (startIndex < possibleValues.size()/2 && !flag) {
					while(finalIndex < possibleValues.size()) {
						if (Math.pow(possibleValues.get(startIndex), 5) - Math.pow(possibleValues.get(finalIndex), 5) == X) {
							System.out.println(possibleValues.get(startIndex) + " " + possibleValues.get(finalIndex));
							flag = true;
						}
						finalIndex++;
					}
					finalIndex = 0;
					startIndex++;
				}
			}
		}
		
		
	}
	
	
	
}
