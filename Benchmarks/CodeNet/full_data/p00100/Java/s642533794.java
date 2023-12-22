import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		BigInteger million = new BigInteger("1000000");
		BigInteger sum;

		while(true){
			int staffCount = stdIn.nextInt();
			if(staffCount == 0)break;
			long[][] staffArray = new long[staffCount][3];
			boolean naFlag = true;
			for(int i = 0;i < staffCount; i++){
				staffArray[i][0] = stdIn.nextLong();
				staffArray[i][1] = stdIn.nextLong();
				staffArray[i][2] = stdIn.nextLong();
				long tempSum = staffArray[i][1] * staffArray[i][2];
				sum = new BigInteger(Long.toString(tempSum));
				if( sum.compareTo(million) >= 0){
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