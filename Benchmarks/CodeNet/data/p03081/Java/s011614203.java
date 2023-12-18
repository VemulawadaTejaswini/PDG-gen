import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String strNum = null;
        String strCards = null;

        PrintWriter out = new PrintWriter(System.out);
        try {
            strNum = br.readLine();
            strCards = br.readLine();

            String strCard[] = strCards.split(" ",0);

            int intCard[] = new int [Integer.parseInt(strNum)];

            for (int i=0 ; i < intCard.length ; i++) {
            	intCard[i] = Integer.parseInt(strCard[i]);
            }

            Arrays.sort(intCard);

            int intA = 0;
            int intB = 0;

            boolean bTurn = true;

            for (int i = intCard.length-1 ; i>=0 ; i--) {

            	if (bTurn) {
            		intA += intCard[i];
            	}else {
            		intB += intCard[i];
            	}

            	bTurn = !bTurn;

            }

            System.out.println(intA - intB);
            out.flush();


        } catch (IOException e) {

        }


    }

}