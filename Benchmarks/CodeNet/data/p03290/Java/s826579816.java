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
        int count1 = 100000000;
        for(int i =0; i < D; i++){
            allAnsPoint[i] = 100 * (i+1) + pArray[i] + cArray[i];
            if(allAnsPoint[i] > G){
                if(pArray[i]< count1) count1 = pArray[i];
            }
        }

        int sum   = 0;
        int count2 = 0;
        for(int i = D-1; i < 0 ; i--){

            for(int j = 1; j <=pArray[D-1];j++){
                
                count2++;
                sum += 100*(i+1)*j;
                if(j == pArray[i]) sum+= cArray[i];
                
                if(sum > G) {
                    
                    break;
                }
            }
        }
        
        if(count2 > count1){

            System.out.println(count2);
        }else{

            System.out.println(count1);
        }
    }
}