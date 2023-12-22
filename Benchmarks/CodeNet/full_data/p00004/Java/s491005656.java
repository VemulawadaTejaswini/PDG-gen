import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str= br.readLine()) != null){
            String[] str2 = str.split(" ");
            double a = Double.parseDouble(str2[0]);
            double b = Double.parseDouble(str2[1]);
            double c = Double.parseDouble(str2[2]);
            double d = Double.parseDouble(str2[3]);
            double e = Double.parseDouble(str2[4]);
            double f = Double.parseDouble(str2[5]);


            double x = (c*e - b*f) / (a*e - b*d);
            double y = (c*d - a*f) / (b*d - a*e);

            BigDecimal bdY = new BigDecimal(y);
            BigDecimal bdX = new BigDecimal(x);

            bdY = bdY.setScale(3, BigDecimal.ROUND_HALF_UP);
            bdX = bdX.setScale(3, BigDecimal.ROUND_HALF_UP);

            if(bdX == -0.000){
                bdX = 0.000;
            }
            if(bdY == -0.000){
                bdY = 0.000;
            }

            System.out.printf("%.3f %.3f",bdX,bdY);
        }
    }
}