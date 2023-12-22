import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                int n = Integer.parseInt(reader.readLine());
                if(n == 0){
                    break;
                }
                String line = reader.readLine();
                String[] s = line.split(" ");
                double sum1 = 0;
                for(int i = 0; i < n; i++){
                    sum1 += Double.parseDouble(s[i]);
                }
                double ave = sum1 / n;
                double sum2=0;
                for(int i = 0; i < n; i ++){
                    sum2 += (Double.parseDouble(s[i])-ave)*(Double.parseDouble(s[i])-ave);
                }
                double sigma = Math.sqrt(sum2/n);
                System.out.printf("%.8f\n",sigma);
            }
        }catch(IOException e){

        }
    }
}
