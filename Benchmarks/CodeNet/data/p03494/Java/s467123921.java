import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kaisuu = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String []N = line.split(" ");
        int count = 0;
        int num;
        
        for(int j = 0; j < N.length; j++){
            num = Integer.parseInt(N[j]);
            if(num % 2 != 0){
                System.out.println(count);
                System.exit(0);
            }
            
        }
        while(true){
            for(int i = 0; i < N.length; i++){
                num = Integer.parseInt(N[i]);
                if(num % 2 != 0){
                    System.out.println(count);
                    System.exit(0);
                }else{
                    N[i] = String.valueOf(num / 2);
                    
                }    
            }
            count++;
        }
    }
}
