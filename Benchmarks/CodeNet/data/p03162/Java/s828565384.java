
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Main{
    
    static int[][] status;
    static int[][] dias;
    
    static int[] diff(int i){
        switch(i){
            case 0: 
                return new int[]{1, 2};
            case 1: 
                return new int[]{0, 2};
            case 2: 
                return new int[]{0, 1};
        }
        return null;
    }
    
    static int obtMax(int i, int j){
        //caso base
        if(status[i][j] != 0) return status[i][j];
        if(i == 0) return dias[0][j];
        
        int[] diffs = diff(j);
        int max = -1, maxTmp;
        for(int k = 0; k < diffs.length; k++){
            maxTmp = obtMax(k - 1, diffs[k]);
            if(maxTmp > max) max = maxTmp; 
        }
       
       return status[i][j] = max + dias[i][j];
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        status = new int[input][3];
        dias = new int[input][3];
        for(int i = 0; i < input; i++){
            dias[i] = new int[]{scan.nextInt(), scan.nextInt(), scan.nextInt()};
        }
        int max0 = obtMax(input - 1, 0);
        int max1 = obtMax(input - 1, 1);
        int max2 = obtMax(input - 1, 2);
        int sout = Math.max(Math.max(max0, max1), max2);
        System.out.println(sout);
    }
    
}