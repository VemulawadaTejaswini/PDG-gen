import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int staffCount = stdIn.nextInt();
			if(staffCount == 0)break;
			int[][] staffArray = new int[staffCount][3];
			boolean naFlag = true;
			for(int i = 0;i < staffCount; i++){
				staffArray[i][0] = stdIn.nextInt();
				staffArray[i][1] = stdIn.nextInt();
				staffArray[i][2] = stdIn.nextInt();
				if(staffArray[i][1] * staffArray[i][2] >= 1000000 ){
					System.out.println(staffArray[i][0]);
					naFlag = false;
				}
			}
			if(naFlag){
				System.out.println("NA");
			}
		}
	}
}