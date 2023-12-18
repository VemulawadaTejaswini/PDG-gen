import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> RateArray = new ArrayList<Integer>();

	    for (int i = 0; i < N; i++) {
	    	int Rate = sc.nextInt();
	    	RateArray.add(Rate);
	    }

		int min = 0;

	    int j = 0;
	    while(j<3200) {
	    	loop: for (int k = 0; k < N; k++) {
	    		if (RateArray.get(k)>=j && RateArray.get(k)<j+400) {
	    			min++;
	    			break loop;
	    		}
	    	}
	    	j = j + 400;
	    }

		int More3200 = 0;

	    for (int i = 0; i < N; i++) {
	    	if (RateArray.get(i)>=3200) {
	    		More3200++;
	    	}
	    }
	    System.out.println(min + " " + (min+More3200));
	}
}