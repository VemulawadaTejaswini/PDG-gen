import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] input1 = parameter.nextLine().split(" ");
        String[] input2 = parameter.nextLine().split(" ");
        String[] input3 = parameter.nextLine().split(" ");

        Integer countKillMoster = 0;

        for (int i = 0; i < input3.length; i++) {

    		if (Integer.valueOf(input3[i]) <= Integer.valueOf(input2[i])) {

    			countKillMoster = countKillMoster + Integer.valueOf(input3[i]);
    		} else {

    			Integer secondStreetKillNo = Integer.valueOf(input3[i]) - Integer.valueOf(input2[i]);

    			if (secondStreetKillNo > Integer.valueOf(input2[i + 1])) {

    				countKillMoster = countKillMoster + Integer.valueOf(input2[i]) + Integer.valueOf(input2[i+1]);
    			} else {

    				countKillMoster = countKillMoster + Integer.valueOf(input2[i]) + secondStreetKillNo;
    			}
    		}
    	}

        System.out.println(countKillMoster);
    }
}
