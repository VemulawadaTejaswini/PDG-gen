import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
		Integer i;
        try {
        	i = Integer.parseInt(str);
        } catch (NumberFormatException nfex) {
        	System.out.println("数字を入力してください");
        	return;
        }
        
        if (1 <= i && i <= 1000000) {
        	if (i % 2 == 0) {
        		i = i / 2 - 1;
        	} else {
        		i = (i - 1) / 2;
        	}
        	System.out.println(i);
        } else {
        	System.out.println("範囲外の数字です");
        }
        return;
	}
}
