import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	double money = 100;
    	int week;
    	while (scan.hasNextInt()){
    		week = scan.nextInt();
    		for(int i = 0; i < week; i++){
    			money = Math.ceil(money*1.05);
    		}
    		System.out.println((int)money*1000);
    	}
    }
}