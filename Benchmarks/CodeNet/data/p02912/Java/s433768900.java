import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] line = sc.nextLine().split(" ");
    	int itemsCount = Integer.parseInt(line[0]);
    	int couponCount = Integer.parseInt(line[1]);
    	String[] priceLine = sc.nextLine().split(" ");
    	List<Long> allPrice = new ArrayList<>();
    	
    	//set the numbers
    	for(int i = 0;i<itemsCount;i++) {
    		allPrice.add(Long.parseLong(priceLine[i]));
    	}
    	//divde by two with coupon
    	for(int i = 1;i<=couponCount;i++) {
    		Collections.sort(allPrice,Collections.reverseOrder());
    		long biggestPrice = allPrice.get(0);
    		if(biggestPrice != 0) {
    			biggestPrice = biggestPrice/2;
    			allPrice.set(0, biggestPrice);
    		}
    	}
    	long result = 0;
    	for(int i = 0;i<allPrice.size();i++) {
    		result += allPrice.get(i);
    	}
    	System.out.println(result);
    	
    }
}