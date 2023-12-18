import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int fihundred = x / 500;
		while(fihundred > a) {
			fihundred--;
		}
		int largest = b * 100 + c * 50;
	    int count = 0;
	    for(int i = fihundred; i >= 0; i--) {
	    		int money = x - i * 500;
	    		if(money > largest) {
	    			System.out.println(count);
	    			return;
	    		}
	    		int hundred1 = money / 100;
	    		int fifty1 = money % 100 / 50;
	    		while(hundred1 > b) {
	    			hundred1--;
	    			fifty1 += 2;
	    		}
	    		if(fifty1 > c) {
	    			System.out.println(count);
	    			return;
	    		}
	    		count++;
	    		while(hundred1 > 0) {
	    			hundred1--;
	    			fifty1 += 2;
	    			if(fifty1 > c) break;
	    			else {

	    				count++;
	    			}
	    		}
	    }
	    System.out.println(count);
	}
}