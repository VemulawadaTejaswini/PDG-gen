import java.io.*;
 
class Main {
     public static void main(String[] args) {
 
        int intNum1 = 0;
        int intNum2 = 0;
        int intNum3 = 0;
        int intAnswer = 0;
 
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strLine = br.readLine();
            String[] strLineAry = strLine.split(" ");
 
            intNum1 = Integer.parseInt(strLineAry[0]);
            intNum2 = Integer.parseInt(strLineAry[1]);
            intNum3 = Integer.parseInt(strLineAry[2]);
 
            for(int i = intNum1; i <= intNum2; i++) {
                if(intNum3 % i == 0) {
                    intAnswer++;
                }
            }
            System.out.println(intAnswer);
        }

        catch(IOException e) {
            System.out.println(e);
        }
        catch(NumberFormatException e) {
            System.out.println("??°?????§??\??????????????????");
        }
    }
}