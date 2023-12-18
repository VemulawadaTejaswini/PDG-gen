import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String line = sc.next();
        String[] lineA = line.split("");
        int[] box = new int[N];
        for(int i=0; i<N; i++){
            box[i] = Integer.parseInt(lineA[i]);
        }
        
        for(int j=N-1; j>0; j--){
            int[] temp = new int[N];
            for(int i=0; i<N; i++){
                if(i == j){
                    break;
                }
                
                temp[i] = box[i] - box[i+1];
                if(temp[i]<0){
                    temp[i] = temp[i]*(-1);
                }
            }
            box = temp;
        }
        
        System.out.println(box[0]);

    }
    

}
