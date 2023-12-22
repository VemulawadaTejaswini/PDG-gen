package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args)  {
		createOutputArr();
	}

	private static void createOutputArr() {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					int inputArrayNum = Integer.parseInt(br.readLine());
					String[] inputStr = br.readLine().split(" ");
					String[] outputStrArr = new String[inputArrayNum];

					for(int i = inputArrayNum - 1; i > -1; i--) {
						outputStrArr[i] = inputStr[inputArrayNum - i -1];
					}

					String outputString = "";
					int i = 0;
					for(String output: outputStrArr) {
						outputString = outputString + output;
						i++;
						if(i != inputArrayNum){
							outputString  = outputString + " ";
						}
					}

					System.out.print(outputString);
				} catch (IOException e) {
					e.printStackTrace();
				}





	}

}