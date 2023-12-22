import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			Price p = new Price();
			p.feeCalculation(scan);
			System.out.println(p.getPrice());
		}
	}
}

class Price{
	private int pasta;
	private int juice;
	private int lunchPrice;
	
	public Price(){
		pasta = 0;
		juice = 0;
		lunchPrice = 0;
	}
	
	public void feeCalculation(Scanner scan){
		pasta = Math.min(scan.nextInt(),scan.nextInt());
		pasta = Math.min(pasta,scan.nextInt());
		juice = Math.min(scan.nextInt(),scan.nextInt());
		lunchPrice = pasta + juice - 50;
	}
	
	public int getPrice(){
		return lunchPrice;
	}
}