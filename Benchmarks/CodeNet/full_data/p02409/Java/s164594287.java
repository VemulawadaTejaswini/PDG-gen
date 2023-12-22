import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException{

		//?????£?????????
		int numN;
		int build;
		int floor;
		int room;
		int menber = 0;
		
		String s = "";
		String output = "";

		//[?£?][????±?][??¨?±?]
		int college[][][] = new int[4][3][10];
		String[] NumList = new String[4];

		Scanner sc = null;

		try {

				sc = new Scanner(System.in);
			int n = sc.nextInt();

			//?????????????????°?????£??\
			numN = n;

			//?????±???????????????
			for (int i = 1; i <= numN; i++) {

				for (int j = 0; j < NumList.length; j++) {

					s = sc.next();
					NumList[j] = s;
				}

				build  = (Integer.parseInt(NumList[0])) - 1;
				floor  = (Integer.parseInt(NumList[1])) - 1;
				room   = (Integer.parseInt(NumList[2])) - 1;
				menber = Integer.parseInt(NumList[3]);

				//?????±?????????
				college[build][floor][room] += menber;

				//??¨?±?????????°????????????
				//menber = 0;
			}

			for (int i = 0; i < college.length; i++) {

				for (int j = 0; j < college[0].length; j++) {
					//????????????
					for (int k = 0; k < college[0][0].length; k++) {
						output += " ";
						//??¨?±??????????
						output += college[i][j][k];
					}
					System.out.println(output);
					output = "";
				}
				if(i != college.length - 1){
					System.out.println("####################");
				}
			}
		} finally {
			sc.close();
		}
	}
}