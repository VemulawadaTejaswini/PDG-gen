import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;
        String strCell = null;

        try {
            str1 = br.readLine();
            strCell = br.readLine();

            String str1a[] = str1.split(" ");

            int intLen = Integer.parseInt(str1a[0]);
            int intCnt = Integer.parseInt(str1a[1]);

            int intCell[] = new int[intLen];

            for (int i = 0 ; i < intLen ; i++) {
            	intCell[i] = 1;
            }


            for (int j = 0 ; j < intCnt ; j++) {
                String strSpell = br.readLine();
                String strSpella[] = strSpell.split(" ");

                char cCell = strSpella[0].charAt(0);
                char cMove = strSpella[1].charAt(0);

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
            br.close();

            int intSum = 0 ;
            for (int i = 0 ; i < intLen ; i++) {
            	intSum += intCell[i];
            }

            System.out.println(intSum);



        } catch (IOException e) {

        }


    }

}