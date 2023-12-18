import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		int changeNum = 0;
		Scanner scan = new Scanner(System.in);

		int sNum = scan.nextInt();
		int sColNum = 0;
		int preNum = 0;

		for(int i =0; i < sNum; i++) {

			sColNum = scan.nextInt();

			if(sColNum == preNum){
				changeNum++;
				preNum = 0;
				continue;
			}

			preNum = sColNum;

		}

		System.out.print(changeNum);
		scan.close();

	}

}