import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int W = sc.nextInt();
            int H = sc.nextInt();
            int N = sc.nextInt();
            int max = 0;
            max = Math.max(W,H);
            max = Math.max(max, N);

            int wArray[] = new int[max];
            int hArray[] = new int[max];
            int nArray[] = new int[max];
         try{
            for(int i = 0;i < max;i++){
                wArray[i] = sc.nextInt();
                hArray[i] = sc.nextInt();
                nArray[i] = sc.nextInt();
            }
        }catch(Error e){

        }
            // System.out.println(sum);

        
    }
}