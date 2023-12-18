import java.util.*;

public class Main {

    public static void main(String[] args) {

        int ans = 0;

        Scanner scan = new Scanner(System.in);
        int D = Integer.parseInt(scan.next());
        int G = Integer.parseInt(scan.next());
        int[] pArray = new int[D];
        int[] cArray = new int[D];

        for(int i =0; i < D; i++){
            pArray[i] = Integer.parseInt(scan.next());
            cArray[i] = Integer.parseInt(scan.next());
        }

        int [] allAnsPoint = new int[D];
        int max = 0;
        int minP = 100000000;
        for(int i =0; i < D; i++){
            allAnsPoint[i] = 100 * (i+1) + pArray[i] + cArray[i];
            if(allAnsPoint[i] > G){
                if(pArray[i]< minP) minP = pArray[i];
            }
        }
        
        System.out.println(minP);
    }
}