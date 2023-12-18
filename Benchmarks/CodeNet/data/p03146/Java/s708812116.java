import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	// 入力
    	int s = sc.nextInt();
    	ArrayList<Integer> arg = new ArrayList<>();
    	arg.add(s);
    	int i;

    	for (i = 0; i < 1000000; i++ ){
        	if(s % 2 == 0){
        		s = s / 2;
        		arg.add(s);

        	} else {
        		s = 3 * s + 1;
        		arg.add(s);

        	}

        	for (int j = 0; j < arg.size(); j++ ) {
        		if (arg.get(j) == s) {
        		//if (arg[j] == s) {
        			break;
        		}
        	}

    	}

    	// 出力
    	System.out.println(i+1);
    }
}