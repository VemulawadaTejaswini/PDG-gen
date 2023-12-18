import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        String strCell = null;

        try {


            int intLen = Integer.parseInt(scan.next());
            int intCnt = Integer.parseInt(scan.next());
            strCell = scan.next();

            int intCell[] = new int[intLen];

            for (int i = 0 ; i < intLen ; i++) {
            	intCell[i] = 1;
            }

            for (int j = 0 ; j < intCnt ; j++) {

                char cCell = scan.next().charAt(0);
                char cMove = scan.next().charAt(0);

                for (int i = 0 ; i < intLen ; i++) {

	                if (strCell.charAt(i) == cCell) {
	                	if (cMove == 'L') {
	                		if (i == 0) {
	                    		intCell[i] = 0;
	                		}else {
	                    		intCell[i-1] += intCell[i];
	                    		intCell[i] = 0;
	                		}
	                	}
	                	if (cMove == 'R') {
	                		if (i == intLen-1) {
	                    		intCell[i] = 0;
	                		}else {
	                    		intCell[i+1] += intCell[i];
	                    		intCell[i] = 0;
	                		}
	                	}
	                }
                }
            }

            int intSum = 0 ;
            for (int i = 0 ; i < intLen ; i++) {
            	intSum += intCell[i];
            }

            System.out.println(intSum);

        } catch (Exception e) {

        }
    }
}