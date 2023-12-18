import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		int changeNum = 0;
		String sColorList = new Scanner(System.in).nextLine();

		String[] scl = sColorList.split(" ",0);


		int preNum = 0;
		for(String sc : scl){

			if(Integer.parseInt(sc) == preNum){
				changeNum++;
				preNum = 0;
				continue;
			}

			preNum = Integer.parseInt(sc);

		}

		System.out.print(changeNum);


	}

}