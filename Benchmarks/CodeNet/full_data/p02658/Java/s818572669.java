import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();

        String[] numbers = b.split(" ");
        Arrays.sort(numbers, Comparator.reverseOrder());
        
        double ans = 1;
        boolean flg = true;
        if(Arrays.asList(numbers).contains("0")) {
    		flg = false;
    	} else {
    		for(int i = 0; i < a; i++) {
            	if(Double.parseDouble(numbers[i]) <= Math.pow(10, 18)/ans) {
            		ans = ans * Double.parseDouble(numbers[i]);
            	} else {
            		flg = false;
            	}
    		}
    	}

        if(flg) {
        	System.out.println(BigDecimal.valueOf(ans).toPlainString());
        	//System.out.println(ans.toPlainString());
        } else {
        	System.out.println(-1);
        }

        sc.close();
	}

}
