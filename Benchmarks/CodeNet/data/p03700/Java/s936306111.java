import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int h[] = new int[N];
        
        for(int i=0;i<N;i++){
            h[i] = sc.nextInt();
        }
                
        int atkCount = 0;
        while(true){
            int hCnt = 0;
            boolean maxF = true;
            int maxh = MaxSearch(h);
            
            int tmpCnt = maxh / A;
            if (tmpCnt == 0 && maxh > 0){
                tmpCnt = 1;
            }
            
            for (int i=0;i<h.length;i++){
                if (h[i] == maxh && maxF){
                    h[i] -= tmpCnt * A;
                    maxF = false;
                }else{
                    h[i] -= tmpCnt * B;
                }
                if (h[i] > 0){
                    hCnt++;
                }
            }
            
            atkCount += tmpCnt;
                        
            if (hCnt <= 0){
                break;
            }
        }
        System.out.println(atkCount);
    }
    /*大きい順にソート*/
    static int MaxSearch(int s[]){
        int max = 0;
        for (int i=0;i<s.length;i++){
            if (max < s[i]){
                max = s[i];
            }
        }
        return max;
    }
}
