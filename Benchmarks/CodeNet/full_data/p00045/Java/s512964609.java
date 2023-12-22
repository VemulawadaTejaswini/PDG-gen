import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        int dataNum = 0;
        int totalAmount = 0;
        int totalCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readString = null;
        while ((readString = br.readLine()) != null) {

            dataNum ++;
            String[] strValues = readString.split(",");
            int goodsCnt = Integer.parseInt(strValues[1]);
            totalAmount += Integer.parseInt(strValues[0]) * goodsCnt;
            totalCount += goodsCnt;
        }

        System.out.println(totalAmount);
        System.out.println(Math.round((double)totalCount/(double)dataNum));
    }
}