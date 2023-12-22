import java.io.*;
import java.text.DecimalFormat;
 

class Main {
 
    public static void main(String[] args) {

        int intNum1 = 0;
        int intNum2 = 0;
        int intAnswer = 0;
        int intDivision = 0;
        int intSurplus = 0;
        double dbDivision = 0.0;
 
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String strLine = br.readLine();
            String[] strLineAry = strLine.split(" ");

            intNum1 = Integer.parseInt(strLineAry[0]);

            intNum2 = Integer.parseInt(strLineAry[1]);

            intDivision = intNum1 / intNum2;

            intSurplus = intNum1 % intNum2;

            dbDivision = (double)intNum1 / (double)intNum2;

            DecimalFormat insdf = new DecimalFormat("0.00000");

            System.out.println(intDivision + " " + intSurplus +  " " + insdf.format(dbDivision));

            }
        catch(IOException e) {

            System.out.println(e);
 
        }
        catch(NumberFormatException e) {

            System.out.println("??°?????§??\??????????????????");

        }
    }
}