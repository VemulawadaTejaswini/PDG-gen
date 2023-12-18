import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int A = Integer.parseInt(temp[1]);
        int B = Integer.parseInt(temp[2]);
        
        int tempSum = 0,sumAns = 0;
       
        for(int i = 1 ; i <= N ; i ++){
            int n = i;
            while(n > 0){
                tempSum += n % 10;
                n /= 10;
                
            }     
            if(A <= tempSum && tempSum <= B){
                
                sumAns += i;
                
            }
            tempSum = 0;
        }
        
        
        System.out.println(sumAns);
        
        
    }
}
