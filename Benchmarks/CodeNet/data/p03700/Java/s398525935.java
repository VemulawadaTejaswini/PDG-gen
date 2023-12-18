import java.util.Arrays;
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
        
        Arrays.sort(h);
        
        int iMin = 1;
        int iMax = h[h.length-1];
        
        while(iMin < iMax){
            int iMid = (iMax + iMin)/2;
            
            if(enough(h, A, B, iMid)){
                iMax = iMid;
            }else{
                iMin = iMid;
            }
            if((iMax - iMin) == 1){
                break;
            }
        }
        System.out.println(iMax);
    }
    
    static boolean enough(int[] h, int A, int B, int T){
        boolean rtn = true;
        int count = 0;
        int addDmg = A - B;
        
        for(int i=0;i<h.length;i++){
            int tmp = h[i];
            tmp = tmp - (B * T);
            if (tmp > 0){
                double tCnt = (double)tmp / (double)addDmg;
                count += Math.ceil(tCnt);
            }
        }
        if(count > T){
            rtn = false;
        }
        return rtn;
    }

}