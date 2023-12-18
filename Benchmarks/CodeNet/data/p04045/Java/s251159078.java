import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int unlikeNum = sc.nextInt();
		int pay = price;
	    int[] array = new int[unlikeNum];
	    for(int i = 0; i<unlikeNum; i++){
	        array[i] = sc.nextInt();
	    }
	    while(!(jadgeUnlikeNum(pay, unlikeNum, array))){
	    	pay++;
	    }
	    System.out.println(pay);
	}

	public static boolean jadgeUnlikeNum(int pay, int unlikeNum, int[] array) {
		boolean ans = true;
		String payStr = String.valueOf(pay);
		String payNum[] = new String[payStr.length()];
		String arrayStr[] = new String[unlikeNum];

		for(int i = 0; i <payStr.length(); i++) {
			payNum[i] = payStr.substring(i, i+1);
		}

		for(int i = 0; i <array.length; i++) {
			arrayStr[i] = String.valueOf(array[i]);
		}

		for(int i = 0; i <payNum.length; i++) {
			for(int j = 0; j <arrayStr.length; j++) {
				if(payNum[i].equals(arrayStr[j])) {
					ans = false;
					break;
				}
			}
		}
		return ans;
	}
}
