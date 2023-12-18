
import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        sort(ary);
        long max = ary[n-1];
        long min = 0;
        int flag = 0;
        OUTER:
        for (int i = n-2; i > 0; i--) {
            switch (flag) {
                case 0:
                    {
                        long tmp = max;
                        max = ary[i];
                        if(max == tmp){
                            flag++;
                        }       break;
                    }
                case 1:
                    if(max == ary[i])continue;
                    min = ary[i];
                    flag++;
                    break;
                default:
                    {
                        long tmp = min;
                        min = ary[i];
                        if (min == tmp) {
                            break OUTER;
                        }
                        break;
                    }
            }
        }
        long ans = max*min;
        System.out.print(ans);
    }
    
}
