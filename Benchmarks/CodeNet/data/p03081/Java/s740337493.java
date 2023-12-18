import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        String str1 = null;
        String strCnt = null;
        String strCell = null;

        try {
//            str1 = br.readLine();
//            strCell = br.readLine();

            str1 = scan.next();
            strCnt = scan.next();
            strCell = scan.next();

//            System.out.println(str1);
//            System.out.println(strCell);

            int intLen = Integer.parseInt(str1);
            int intCnt = Integer.parseInt(strCnt);

            int intCell[] = new int[intLen];

            for (int i = 0 ; i < intLen ; i++) {
            	intCell[i] = 1;
            }

            for (int j = 0 ; j < intCnt ; j++) {
                String strSpell = scan.next();
                String strSpell2 = scan.next();

//                System.out.println(strSpell);
//                System.out.println(strSpell2);

//                String strSpella[] = strSpell.split(" ");

                char cCell = strSpell.charAt(0);
                char cMove = strSpell2.charAt(0);

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