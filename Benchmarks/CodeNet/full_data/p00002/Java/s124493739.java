import java.util.Scanner;

class Main {	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count;
		
		while(scan.hasNextInt()){
			count = 1;
			int addNum = scan.nextInt() + scan.nextInt();
			while(addNum>=10){
				count++;
				addNum/=10;
			}
			System.out.println(count);
		}
	}
}