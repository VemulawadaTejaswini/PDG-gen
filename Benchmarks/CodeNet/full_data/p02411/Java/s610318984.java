import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		//-1 -1 -1?????\?????????????????§??°?????????
		while(true) {
			
			//list???????´???????
			list.add(sc.nextLine());
			if(list.get(list.size() - 1).equals("-1 -1 -1")) {
				break;
			}
		}
		
		//?????±???int???????????????2?¬??????????????§?????????????
		int [][] data = new int[list.size() - 1][3];
		for(int i = 0; i < list.size() - 1; i++) {
			String s = list.get(i);
			String [] ary = s.split(" ");
			for(int j = 0; j < ary.length; j++) {
				data[i][j] = Integer.parseInt(ary[j]);
			}
		}
		
		//???????????¨?????????
		for(int i = 0; i < data.length; i++) {
			int sum = 0;
			for(int j = 0; j < data[i].length - 1; j++) {
				sum += data[i][j];
			}
			if(data[i][0] == -1 || data[i][1] == -1) {
				System.out.println("F");
			}else if(sum >= 80) {
				System.out.println("A");
			}else if(sum >= 65) {
				System.out.println("B");
			}else if(sum >= 50) {
				System.out.println("C");
			}else if(sum >= 30){
				if(data[i][2] >= 50){
					System.out.println("C");
				}else {
					System.out.println("D");
				}
			}else {
				System.out.println("F");
			}
		}
	}

}