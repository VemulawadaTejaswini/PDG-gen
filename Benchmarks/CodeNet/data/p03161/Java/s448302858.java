import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] sizes = scan.nextLine().split(" ");
        int size = Integer.parseInt(sizes[0]);
        int maxJ = Integer.parseInt(sizes[1]);

        String heights = scan.nextLine();
        String[] hstr = heights.split(" ");
        int[]hs = new int[hstr.length];
        for (int i = 0 ; i<hstr.length ; i++) {
          hs[i] = Integer.parseInt(hstr[i]);
        }
        
        scan.close();
        
        int[] res = new int[size];
        res[0] = 0;
          
        for (int i = 1 ; i < size ; i++) {
            res[i] = Math.abs(hs[i]-hs[i-1]) + res[i-1];
            for (int j = 2 ; j < maxJ ; j++) {
                if (i-j < 0) break;
                res[i] = Math.min(res[i], Math.abs(hs[i] - hs[i-j]) + res[i-j]);
            }
        }
        
        System.out.print(res[size-1]);
    }
}