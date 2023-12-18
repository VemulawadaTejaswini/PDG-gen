
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        String str = s.next();
        
        int[] outputs = new int[q];
        int[][] lrs = new int[q][2];
        
        for (int i = 0; i < q; i ++) {
            lrs[i][0] = s.nextInt();
            lrs[i][1] = s.nextInt();
        }
        
        for (int i = 1; i < str.length(); i ++) {
            if (str.substring(i - 1, i + 1).equals("AC")) {
                for (int j = 0; j < q; j ++) {
                    if (lrs[j][0] <= i && lrs[j][1] >= i + 1)
                        outputs[j] ++;
                }
            }
        }
        
        for (int i : outputs)
            System.out.println(i);
        
    }
    
}
