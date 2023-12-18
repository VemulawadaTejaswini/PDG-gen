import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = x[i];
        }
        
        Arrays.sort(y);
        int y1 = y[n/2-1];
        int y2 = y[n/2];
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(x[i] <= y1){
                sb.append(y2).append(System.lineSeparator());
            }else{
                sb.append(y1).append(System.lineSeparator());
            }
        }
        
        System.out.print(sb);
    }
}