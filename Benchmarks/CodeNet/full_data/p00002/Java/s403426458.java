import java.io.IOException;
import java.util.Scanner;

class Main {	
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(System.in);
		int count;
		
		while(scan.hasNextInt()){
			count = 1;
			int addNum = Integer.parseInt(scan.next()) + Integer.parseInt(scan.next());
			while(addNum>=10){
				count++;
				addNum/=10;
			}
			System.out.println(count);
			scan = new Scanner(System.in);
		}
	}
}