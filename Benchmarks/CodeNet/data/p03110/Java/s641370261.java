import java.io.*;

public class Main {


    private static double solver(String input) {
        String[] inputArray = input.split(" ");
        double dValue = Double.parseDouble(inputArray[0]);

        if(inputArray[1].equals("JPY")){
            return dValue;
        }else{
            return dValue * 380000;
        }


    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String inputNumStr = "";
        int inputNum=0;
        try {
            inputNumStr = br.readLine();
            inputNum = Integer.parseInt(inputNumStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        double ans=0;
        for (int i = 0; i < inputNum; i++) {
            String input = "";
            try {
                input = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ans += solver(input);
        }
        System.out.println(ans);

    }
}