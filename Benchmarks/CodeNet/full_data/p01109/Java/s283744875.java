import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 1;

		Scanner sc = new Scanner(System.in);

        int inputValue = 0;

        int ninzu = 0;
        String shotokuStr = "";
       int shotoku = 0;
       int shotokuAvg = 0;

       int result = 0;

        // inputValue が 0 でなければループ
       	shotokuStr = sc.nextLine();
//        while (Integer.parseInt(shotokuStr) != 0) {
        while (!"0".equals(shotokuStr)) {
//        	if("0".equals(shotokuStr)) {
//        		break;
//        	}


        	if ( count % 2 == 1) {
        		ninzu = Integer.parseInt(shotokuStr);
        	} else {
        		shotoku = 0;
        		result = 0;
        		String[] shotokuList = shotokuStr.split(" ");
        		for (String shotokuString : shotokuList) {
        			shotoku += Integer.parseInt(shotokuString);
        		}
        		shotokuAvg = shotoku / ninzu;

        		for (String shotokuString : shotokuList) {
        			if (Integer.parseInt(shotokuString) <= shotokuAvg) {
        				result++;
        			}
        		}

        		System.out.println(result);

        	}

            count++;
            shotokuStr = sc.nextLine();
        }

		sc.close();
	}

}

