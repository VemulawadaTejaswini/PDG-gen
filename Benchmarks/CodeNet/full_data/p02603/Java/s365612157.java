import java.util.*;

public class Main {
    
    static int maxMoney = 0;
    static int stockPrice = 0;
    static int days = 0;
    static int[] priceList;

	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
    	days = Integer.parseInt(line);
    	
		line = sc.nextLine();
		String[] lines = line.split(" ", 0);
		priceList = new int[days];
      	
      	for (int i = 0; i < days; i++) {
      	    priceList[i] = Integer.parseInt(lines[i]);
      	}
      	
      	
	    stock(1000, 0, 0, 0);
	    stock(1000, 1, 0, 0);
      	
      	System.out.println(maxMoney);
	}
	
	
	public static void stock(int money, int stocking, int numStock, int day) {
	    if (stocking == 0) { //何もしない
	        
	    } else if (stocking == 1) { //株を買う
	        numStock += money / priceList[day];
	        money = money % priceList[day];
	    } else if (stocking == 2) { //株を売る
	        money += numStock * priceList[day];
	        numStock = 0;
	    }
	    
	    day++;
	    
//	    System.out.printf("stocking:%d day:%d money:%d\n", stocking, day, money);
	    
	    if (day == days) {
	        if (money > maxMoney) {
	            maxMoney = money;
	        }
	        return;
	    }
	    
	    stock(money, 0, numStock, day);
	    if (stocking != 1 && numStock == 0) {
	        stock(money, 1, numStock, day);
	    }
	    if (numStock > 0) {
	        stock(money, 2, numStock, day);
	    }
	}
}
