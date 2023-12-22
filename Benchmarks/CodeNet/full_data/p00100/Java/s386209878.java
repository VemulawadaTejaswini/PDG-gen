import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		BigInteger million = new BigInteger("1000000");
		BigInteger sum;

		while(true){
			int staffCount = stdIn.nextInt();
			if(staffCount == 0)break;
			int[][] staffArray = new int[staffCount][3];
			boolean naFlag = true;
			List<Integer> numberList = new ArrayList<Integer>();
			for(int i = 0;i < staffCount; i++){
				staffArray[i][0] = stdIn.nextInt();
				staffArray[i][1] = stdIn.nextInt();
				staffArray[i][2] = stdIn.nextInt();
				long tempSum = staffArray[i][1] * staffArray[i][2];
//				System.out.println(tempSum);
				sum = new BigInteger(Long.toString(tempSum));
				if( sum.compareTo(million) >= 0){
					numberList.add(staffArray[i][0]);
					naFlag = false;
				}
			}
			if(naFlag){
				System.out.println("NA");
			}else{
				for(int i:numberList){
					System.out.println(i);
				}
			}
		}
	}
}