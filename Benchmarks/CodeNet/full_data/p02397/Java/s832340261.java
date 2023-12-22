

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
				String[] strA = insBR.readLine().split(" ");
				int[] intA = new int[strA.length];
				for(int i = 0;i < strA.length ;i++){
					intA[i] = Integer.parseInt(strA[i]);
				}
				int x = intA[0];
				int y = intA[1];
				if(x == 0 && y == 0){
					break;
				}
				if(intA[1] < intA[0]){
					x = intA[1];
					y = intA[0];
				}
				System.out.println(x + " " + y);

			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
	}
}

