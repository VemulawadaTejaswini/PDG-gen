

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true){

			String str = in.next();

			if(str.equals(null)){

				break;

			}else{

				char[] strArray = str.toCharArray();

				for(int i = 0; i < strArray.length; i++){

					if(Character.isUpperCase(strArray[i])){

						strArray[i] = Character.toLowerCase(strArray[i]);

					}else if(Character.isLowerCase(strArray[i])){

						strArray[i] = Character.toUpperCase(strArray[i]);

					}else{

					}

				}

				for(int i = 0; i < strArray.length; i++){

					System.out.print(strArray[i]);

				}
			}
		}
	}
}