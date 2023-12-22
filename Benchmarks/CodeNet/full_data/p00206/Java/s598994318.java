import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int tripCost = stdIn.nextInt();
			if(tripCost == 0)break;
			for(int i=1;i<=12;i++){
				if(i==12){
					System.out.println("NA");
					break;
				}
				savingMoney += stdIn.nextInt() - stdIn.nextInt();
				if(savingMoney >= tripCost){
					System.out.println(i);
					break;
				}
			}
		}
	}
}