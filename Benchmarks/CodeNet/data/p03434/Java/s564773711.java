import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] cards  = new Integer[N];

        String[] buf = br.readLine().split(" "); 
        for(int i = 0 ; i < N ; i++){
            cards[i] = Integer.parseInt(buf[i]);
        }

        Arrays.sort(cards,Comparator.reverseOrder());  
        int sumA = 0 , sumB = 0;
        
        
        
        for(int i = 0 ; i < N ;i ++){
            if(i % 2 == 0){
                sumA += cards[i];
            }
            else{
                sumB += cards[i];
            }
            
            
        }
        System.out.println(sumA - sumB);
    }
}
