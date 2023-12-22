
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataSetNumber = scan.nextInt();
		Triangle[] dataSet = new Triangle[dataSetNumber];

		for(int i = 0; i < dataSetNumber; i++){
			scan = new Scanner(System.in);
			dataSet[i] = new Triangle(scan);
		}

		for(int i = 0; i < dataSetNumber; i++){
			System.out.println(dataSet[i].tyokkaku());
		}

	}

}

class Triangle{
	int[] hen = new int[3];

	public Triangle(Scanner line){
		for (int i = 0; i < 3; i++) {
			this.hen[i] = line.nextInt();
		}
	}

	public String tyokkaku(){
		String isTyokkaku = "NO";
		if(Math.pow(hen[0], 2) == (Math.pow(hen[1], 2) + Math.pow(hen[2], 2))){
			isTyokkaku = "YES";
		}else if(Math.pow(hen[1], 2) == (Math.pow(hen[0], 2) + Math.pow(hen[2], 2))){
			isTyokkaku = "YES";
		}else if(Math.pow(hen[2], 2) == (Math.pow(hen[0], 2) + Math.pow(hen[1], 2))){
			isTyokkaku = "YES";
		}

		return isTyokkaku;

	}
}