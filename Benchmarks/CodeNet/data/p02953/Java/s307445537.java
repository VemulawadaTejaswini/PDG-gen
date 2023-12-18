import java.security.Timestamp;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");
        int[] mainasu1 = new int[times];
        int[] mainasu2 = new int[times];

        int times = Integer.parseInt(line1[0]);

        int min = 0;

        for (int i = 0; i < times; i++ ) {

        	if (min == 0) {

        		min = Integer.parseInt(line2[i]);
        	} else {

        		if (min > Integer.parseInt(line2[i])) {

        			min = Integer.parseInt(line2[i]);
        		}
        	}
        }

        for (int i = 0; i < times; i++) {

        	if (Integer.parseInt(line2[i]) > min) {

        		mainasu1[i] = Integer.parseInt(line2[i]) - 1;
        	} else {

        		mainasu1[i] = Integer.parseInt(line2[i]);
        	}
        }

        for (int i = 0; i < mainasu1.length; i++) {

        	mainasu2[i] = mainasu1[i];
        }

        Arrays.sort(mainasu2);

        int count = 0;

        for (int i = 0; i < mainasu1.length; i++) {

        	if (mainasu1[i] != mainasu2[i]){

        		count = count + 1;
        	}
        }

        if (count > 0) {

        	System.out.println("No");
        } else {

        	System.out.println("Yes");
        }
    }
}
