import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    String [] info = br.readLine().split(" ");
        long mVal = (long)Math.pow(10,18);

        long sum = 1;

        for(int i = 0; i < N; i++){
            if(Long.parseLong(info[i]) == 0){
                break; 
            }
            sum *= Long.parseLong(info[i]); 
            
            if(sum > (long)Math.pow(10,18)){
                break;
            }
        }

        if(sum < (long)Math.pow(10,18)){
            System.out.println(sum);
        }
        else {
            System.out.println("-1");
        }

    }
}
