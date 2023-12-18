import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int S = scanner.nextInt();
        
        
        int count = 0;
        for(int i=0;i<=K;i++){
            if(i != S){
                for(int j=0;j<=K;j++){
                    if(i+j != S){
                        count++;
                    }else if(i+j == S)
                    {
                        count++;
                        break;
                    }
                }
            }else if(i == S){
                count++;
            }
        }
        
        System.out.println(count);
    }
}