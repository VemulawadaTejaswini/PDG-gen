import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                int x = Integer.parseInt(br.readLine());
                if(x==0){
                    break;
                }
                
                String[] arr = br.readLine().split("\\s");
                Double[] data = new Double[x];
                Double sum = 0.0;
                for(int i=0; i<x; i++){
                    data[i] = Double.parseDouble(arr[i]);
                    sum += data[i];
                }
                
                Double avg = sum/x;
                Double tmp = 0.0;
                for(int i=0; i<x; i++){
                    tmp += Math.pow(data[i] - avg, 2);
                }
                Double stdev = Math.sqrt(tmp/x);
                System.out.println(String.valueOf(stdev));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

