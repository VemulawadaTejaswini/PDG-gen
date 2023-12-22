
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Sales sales = new Sales();
		String input;
		while((input = br.readLine()) != null){
			String[] str = input.split(",");
			sales.addSales(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}
		sales.printSalesAndAvgSold();
	}
}

class Sales{
	private long numItem;
	private long sumSales;
	private long sumItemsSold;
	
	Sales(){
		numItem = 0;
		sumSales = 0;
		sumItemsSold = 0;
	}
	
	public void addSales(int price, int numSales){
		numItem++;
		long sales = price * numSales;
		sumSales += sales;
		sumItemsSold += numSales;
	}
	
	public void printSalesAndAvgSold(){
		System.out.println(sumSales);
		long avgSold = Math.round((double)sumItemsSold / (double)numItem);
		System.out.println(avgSold);
	}
}