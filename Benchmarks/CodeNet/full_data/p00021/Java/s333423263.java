import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            double[] data = new double[8];
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 8; j++){
                data[j] = Double.parseDouble(input[j]);
            }
            
            if((data[3] - data[1])*(data[6] - data[4]) == (data[2] - data[0])*(data[7] - data[5]))    System.out.println("YES");
            else                System.out.println("NO");
        }
    }

}