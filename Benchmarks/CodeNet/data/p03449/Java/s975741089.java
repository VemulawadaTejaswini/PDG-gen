import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int total_row = sc.nextInt();
	    int answer = 0;

	    List<Integer> FirstRowCandy = new ArrayList<Integer>();

	    for (int i = 0; i < total_row; i++) {
	    	int candy = sc.nextInt();
	    	FirstRowCandy.add(candy);
	    }

	    List<Integer> SecondRowCandy = new ArrayList<Integer>();

	    for (int i = 0; i < total_row; i++) {
	    	int candy = sc.nextInt();
	    	SecondRowCandy.add(candy);
	    }

	    for (int i = 0; i < total_row; i++) {
	    	int tmp_answer = 0;

	    	for (int j = 0; j <= i ; j++) {
	    		tmp_answer = tmp_answer + FirstRowCandy.get(j);
	    	}
	    	for (int j = total_row -1; j >= i; j--) {
	    		tmp_answer = tmp_answer + SecondRowCandy.get(j);
	    	}

	    	if (tmp_answer > answer) {
	    		answer = tmp_answer;
	    	}

	    }
	    System.out.println(answer);
	}
}